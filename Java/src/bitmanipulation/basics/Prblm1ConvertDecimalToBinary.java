package bitmanipulation.basics;

// (13)10 -> (1101)2
// 13 % 2 → 1
// 13 / 2 → 6
// 6 % 2  → 0
// 6 / 2  → 3
// 3 % 2  → 1
// 3 / 2  → 1
public class Prblm1ConvertDecimalToBinary {

    public static void main(String[] args) {

        int value = 13;
        StringBuilder sb = new StringBuilder();

        while (value != 1) {
            sb.append(value % 2);
            value /= 2;
        }

        sb.append(1);   // Add the final 1

        System.out.println(sb.reverse());
    }

}
