
// Sample Input
//  5
//  7 
//  -2 
//  4 
//  1 
//  3
//  3
import java.io.*;
import java.util.*;

public class partition1 {

    public static void partition(int[] arr, int pivot) {
        int n = arr.length;
        int pt = 0, itr = 0;
        while (itr < n) {
            if (arr[itr] <= pivot) {
                swap(arr, itr++, pt++);
            } else
                itr++;
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        partition(arr, pivot);
        print(arr);
    }

}