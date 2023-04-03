package week_9_homework;

import java.util.ArrayList;

/**
 *11.Declare following two arraylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */
public class Pr_11_ArrayList_Compare {
       //instance method
    public void compareArrayList() {

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        boolean areEqual = c1.equals(c2);

        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
         //main method
    public static void main(String[] args) {
        //calling instance method into main method
        Pr_11_ArrayList_Compare obj = new Pr_11_ArrayList_Compare();
        obj.compareArrayList();
    }
}

