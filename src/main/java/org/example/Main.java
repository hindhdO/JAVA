package org.example;



public class Main {
    public static void main(String[] args) {

        int[] arr = {120, 60, 1, 56, 21};
        insertionSortR(arr, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSortR(int[] arr, int n) {
        if (n > 0) {
            insertionSortR(arr,n - 1);
            int x = arr[n];
            int j = n - 1;

            while (j >= 0 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = x;
        }
    }

    public static int d(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


