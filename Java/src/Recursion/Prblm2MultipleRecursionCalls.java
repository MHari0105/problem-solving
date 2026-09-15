package recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prblm2MultipleRecursionCalls {
    public static void main(String[] args) {

        //FIBONACCI SERIES
        int value = 5;

//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//
//        for (int i = 2; i < value; i++) {
//            list.add(list.get(i - 1) + list.get(i - 2));
//        }

        System.out.println(value);

        System.out.println(fibonacci(4));
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
