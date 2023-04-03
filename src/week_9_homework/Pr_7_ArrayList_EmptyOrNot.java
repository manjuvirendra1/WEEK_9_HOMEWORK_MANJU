package week_9_homework;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 7.Write a Java program to test if an array list is empty or not
 */
public class Pr_7_ArrayList_EmptyOrNot {
    //creating instance method arrayEmptyOrNot
    public void arrayEmptyOrNot() {
        // Create an empty ArrayList
        ArrayList<String> myList = new ArrayList<>();

        // Use Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to add to the list (or type 'exit' to stop): ");

        // Loop to keep adding input to the list until the user types 'exit'
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            myList.add(input);
            System.out.print("Enter another string (or type 'exit' to stop): ");
        }

        // Check if the ArrayList is empty or not
        if (myList.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }

        //closing scanner
        scanner.close();
    }
        //main method
        public static void main(String[] args) {
        //calling instance method in main method by creating object
        Pr_7_ArrayList_EmptyOrNot obj = new Pr_7_ArrayList_EmptyOrNot();
        obj.arrayEmptyOrNot();
    }
}
