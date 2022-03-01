import java.util.*;

    public class array_bonus{

    public static void main(String[] args) {
    
    // take input from the user
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = scn.nextInt();

    // array of size n
    int[] arr = new int[n];

    // take input from the user
    System.out.println("Enter the elements: ");
    for(int i = 0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }

    // print the array

    System.out.println("The array is: ");
    for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
    }


    }

    }
    

    
    