import java.util.*;

public class printDigitInNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        
        int divisor = 1;
        int temp = n;

        // divisor count krne k liye

        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
    }

    temp = n;
    while (divisor != 0) {
        int digit = temp / divisor;
        System.out.println(digit);

        // number ko chhota krna hai but rem ko store krna h
        temp = temp % divisor;
        // divisor ko chhota kkie
        divisor = divisor / 10; 
    }
    }
    }