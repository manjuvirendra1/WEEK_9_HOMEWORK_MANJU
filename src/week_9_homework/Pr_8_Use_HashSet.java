package week_9_homework;
/**
 *8.Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;
import java.util.Set;

public class Pr_8_Use_HashSet {
      //instance method useHashSet
    public void useHashSet() {
            Set<Integer> set = new HashSet<>();

            // add numbers to the set
            set.add(4);
            set.add(7);
            set.add(8);
            // check which numbers between 1 and 10 are in the set
            for (int i = 1; i <= 10; i++) {
                if (set.contains(i)) {
                    System.out.println(i + " is in the set");
                } else {
                    System.out.println(i + " is not in the set");
                }
            }
        }

    public static void main(String[] args) {
        Pr_8_Use_HashSet obj = new Pr_8_Use_HashSet();
         obj.useHashSet();
    }
}