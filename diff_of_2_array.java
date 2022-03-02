import java.util.*;

    public class diff_of_2_array{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        
        // new array for output
        int[] arr3 = new int[n];
        for(int i=0;i<n;i++){
            arr3[i] = arr1[i] - arr2[i];
        }

        System.out.println("The difference of the two arrays is");
        for(int i=0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
    