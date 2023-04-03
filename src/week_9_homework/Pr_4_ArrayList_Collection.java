package week_9_homework;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 4.Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Pr_4_ArrayList_Collection {
        //instance method newArrayList
    public void newArrayList() {
        // create a new array list of colors
        ArrayList<String> colors = new ArrayList<>();

        // adding some initial colors to the list
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter additional colors
        System.out.println("Enter additional colors (type 'done' to finish):");

        // read each color input and add it to the list
        while (true) {
            String color = scanner.nextLine();
            if (color.equalsIgnoreCase("done")) {
                break;
            }
            colors.add(color);
        }
        // print out the entire collection using a for each loop
        System.out.println("The colors in the list are:");
        for (String color : colors) { //for each loop
            System.out.println(color);
            //closing scanner
            scanner.close();
        }
    }

        //main method
        public static void main(String[] args) {
        //calling instance method
        Pr_4_ArrayList_Collection obj = new Pr_4_ArrayList_Collection();
        obj.newArrayList();
    }
}


