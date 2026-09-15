package recurssion;

public class Problem1 {

    public static void main(String[] args) {
        System.out.println(summationOfNParameterizedWay(3, 0));
    }

    private static int summationOfNParameterizedWay(int n, int sum) {
        if (n < 1) {
            return sum;
        }

        return summationOfNParameterizedWay(n - 1, sum + n);
    }

}