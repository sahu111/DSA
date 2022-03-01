// https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/find_element_in_an_array/topic

import java.io.*;

import java.util.*;

public class find_element_in_array {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // input from the user - jo element array me search krna hai
        System.out.println("Enter the element to search: ");
        int d = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
            System.out.println(i);
            return;    // returning index value of the element
            }
    }
    System.out.println(-1);  // if element is not found - return -1
    }
}
