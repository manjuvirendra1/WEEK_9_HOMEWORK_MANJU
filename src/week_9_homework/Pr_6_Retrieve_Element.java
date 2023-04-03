package week_9_homework;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *6.Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Pr_6_Retrieve_Element {

           //creating instance method retrieveElements
        public void retrieveElements() {
            //Create an ArrayList of strings
            ArrayList<String> list = new ArrayList<String>();

            // Add some elements to the list
            list.add("apple");
            list.add("banana");
            list.add("orange");
            list.add("pear");

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter an index
            System.out.print("Enter an index: ");
            int index = scanner.nextInt();

            // Retrieve the element at the specified index
            if (index >= 0 && index < list.size()) {
                String element = list.get(index);
                System.out.println("Element at index " + index + ": " + element);
            } else {
                System.out.println("Index out of range.");
            }

            // Close the Scanner object
            scanner.close();
        }

         public static void main(String[] args) {
            //calling instance method in main method
          Pr_6_Retrieve_Element obj = new Pr_6_Retrieve_Element();
             obj.retrieveElements();
    }
    }



