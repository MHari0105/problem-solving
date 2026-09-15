package recursion;

import java.util.Arrays;

public class Prblm1FunctionalRecursion {
    public static void main(String[] args) {

        // SUM OF FIRST N NUMBERS
        int n = 3;
        int value = 0;
        for (int i = 1; i <= n; i++) {
            value += i;
        }
        System.out.println(value);

        int[] arr = {1, 2, 3, 4, 5};
        reverseTheArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(reverseTheArrayUsingRecursion(arr, 0)));

        String str = "MADSAM";
        System.out.println(checkIfPalindrome(str));
        System.out.println(checkIfPalindromeUsingRecursion(str, 0));
    }

    private static void reverseTheArray(int[] arr) {
        for (int leftPtr = 0; leftPtr < arr.length / 2; leftPtr++) {
            int rightPtr = arr.length - 1 - leftPtr;
            int temp = arr[leftPtr];
            arr[leftPtr] = arr[rightPtr];
            arr[rightPtr] = temp;
        }
    }

    private static int[] reverseTheArrayUsingRecursion(int[] arr, int startIndex) {
        if (startIndex > arr.length / 2) {
            return arr;
        }
        swap(arr, startIndex, arr.length - startIndex - 1);
        return reverseTheArrayUsingRecursion(arr, startIndex + 1);
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static boolean checkIfPalindrome(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length / 2; i++) {
            if (charArr[i] != charArr[charArr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfPalindromeUsingRecursion(String str, int pointer) {
        if (pointer >= str.length() / 2) {
            return true;
        }
        if (str.charAt(pointer) != str.charAt(str.length() - pointer - 1)) {
            return false;
        }
        return checkIfPalindromeUsingRecursion(str, pointer + 1);
    }

}
