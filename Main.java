package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int solve(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out sum of n numbers");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int inp = sc.nextInt();
            arr[i] = inp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println(solve(arr, n));
    }
}