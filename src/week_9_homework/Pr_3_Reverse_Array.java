package week_9_homework;
/**
 *3. Write a Java program to reverse an array of integer values.
 */

import java.util.Scanner;

public class Pr_3_Reverse_Array {
     //Creating instance method reverseArray
    public void reverseArray() {
        int count, i;
        int input[] = new int[100];
        int output[] = new int[100];

        Scanner scanner = new Scanner(System.in);
        //print statement to enter number of elements
        System.out.println("Enter Number of Elements in Array: ");
        count = scanner.nextInt();

        System.out.println("Enter " + count + " Numbers");
        for (i = 0; i < count; i++) {
            input[i] = scanner.nextInt();
        }

        for (i = 0; i < count; i++) {
            output[i] = input[count - i - 1];
        }
       //print statement for reverse array
        System.out.println("Reversed Array: ");
        for (i = 0; i < count; i++) {
            System.out.print(output[i] + " ");
            scanner.close();//closing scanner
        }
    }
        //Declaring main method
    public static void main(String[] args) {
        //calling instance method
        Pr_3_Reverse_Array obj = new Pr_3_Reverse_Array();
         obj.reverseArray();
    }
}
