// https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span_of_an_array/topic

import java.util.*;

    public class span_of_array{

    public static void main(String[] args) {
    
    // take input from the user
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = scn.nextInt();

    // array of size n
    int[] arr = new int[n];

    // take array element from the user
    for(int i = 0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }


    int min = arr[0];
    int max = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    
        if (arr[i] > max) {
        max = arr[i];
        }
}
    // print statement
    System.out.println("The span of the array is: ");
    // Span = (array ka sbse bda element) - (array ka sbse small element)
    
    int span = max - min;
    System.out.println(span);
    


    }

    }
