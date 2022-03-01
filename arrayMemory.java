import java.util.*;

    public class arrayMemory{

    // function to swap array elements
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
     // array of size 5
    int[] one = new int[5];
    
    one[0] = 10;
    one[1] = 20;
    one[2] = 30;
    one[4] = 50;
    one[3] = 40;
    for(int i = 0; i<one.length; i++){
        System.out.println(one[i]);
    }
    swap(one, 0, 4);
    System.out.println("After swapping");
    for(int j = 0; j<one.length; j++){
        System.out.println(one[j]);

    }

    }
}
    