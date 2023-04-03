package week_9_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *9.Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Pr_9_HashMap {
        //create instance method
        public void hashMap() {
        // create a new HashMap object called "people"
        Map<String, Integer> people = new HashMap<>();

        // create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

          // add some entries to the map using user input
        System.out.println("Enter names and ages, separated by a space:");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split(" ");
            if (parts.length == 2) {
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                people.put(name, age);
            }
        }

           // iterate over the entries in the map using a for-each loop
             System.out.println("People in the map:");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {// using for each loop
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " is " + age + " years old.");
            scanner.close();//closing scanner
        }
    }
           //main method
           public static void main(String[] args) {
           //calling instance method into main method
            Pr_9_HashMap obj = new Pr_9_HashMap();
              obj.hashMap();
    }
}


