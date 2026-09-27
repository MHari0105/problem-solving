package bitmanipulation.basics;

import java.util.Objects;

// (13)10 -> (1101)2
public class Prblm1ConvertDecimalToBinary {
    public static void main(String[] args) {

        System.out.println(decimalToBinaryConversion(13));
        System.out.println(binaryToDecimalConversion("1101"));
        System.out.println(binaryToDecimalConversionV2("1101"));

    }

    private static String decimalToBinaryConversion(int value) {
        // 13 % 2 → 1
        // 13 / 2 → 6
        // 6 % 2  → 0
        // 6 / 2  → 3
        // 3 % 2  → 1
        // 3 / 2  → 1
        StringBuilder sb = new StringBuilder();

        while (value != 1) {
            sb.append(value % 2);
            value /= 2;
        }

        sb.append(1);   // Add the final 1
        return sb.toString();
    }

    private static int binaryToDecimalConversion(String binaryStr) {
        if (binaryStr.isEmpty()) {
            return 0;
        }

        int solution = 0;
        int power = 0;

        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            int ch = binaryStr.charAt(i) - '0';
            if (ch != 1 && ch != 0) {
                return 0;
            }
            solution += ch * (int) Math.pow(2, power++);
        }

        return solution;
    }

    private static int binaryToDecimalConversionV2(String binaryStr) {

        int solution = 0;
//        0 × 2 + 1 = 1
//        1 × 2 + 1 = 3
//        3 × 2 + 0 = 6
//        6 × 2 + 1 = 13
        for (int i = 0; i < binaryStr.length(); i++) {
            int ch = binaryStr.charAt(i) - '0';
            if (ch != 0 && ch != 1) {
                return 0;
            }
            solution = solution * 2 + ch;
        }

        return solution;
    }

}