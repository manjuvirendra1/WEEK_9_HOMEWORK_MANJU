package week_9_homework;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 *10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */

public class Pr_10_Zone1_StationsName {
        //creating instance method zone1Stations
    public void zone1Stations() {
        Map<String, List<String>> lines = new HashMap<>();
        lines.put("Bakerloo", Arrays.asList("Elephant & Castle", "Lambeth North", "Waterloo", "Charing Cross", "Oxford Circus", "Baker Street", "Marylebone"));
        lines.put("Central", Arrays.asList("Notting Hill Gate", "Oxford Circus", "Tottenham Court Road", "Holborn", "Chancery Lane", "St. Paul's", "Bank"));
        lines.put("Circle", Arrays.asList("Embankment", "Temple", "Blackfriars", "Mansion House", "Cannon Street", "Monument", "Tower Hill"));
        lines.put("District", Arrays.asList("South Kensington", "Victoria", "Westminster", "Embankment", "Blackfriars", "Tower Hill"));
        lines.put("Hammersmith & City", Arrays.asList("Paddington", "Edgware Road", "Baker Street", "Liverpool Street", "Aldgate East"));
        lines.put("Jubilee", Arrays.asList("Baker Street", "Bond Street", "Green Park", "Westminster", "Waterloo"));
        lines.put("Metropolitan", Arrays.asList("Paddington", "Baker Street", "King's Cross St. Pancras", "Liverpool Street", "Moorgate", "Barbican"));
        lines.put("Northern", Arrays.asList("Stockwell", "Kennington", "Waterloo", "Charing Cross", "Leicester Square", "Goodge Street", "Euston", "King's Cross St. Pancras"));
        lines.put("Piccadilly", Arrays.asList("South Kensington", "Knightsbridge", "Piccadilly Circus", "Leicester Square", "Covent Garden", "Holborn", "Russell Square"));
        lines.put("Victoria", Arrays.asList("Victoria", "Green Park", "Oxford Circus", "Warren Street", "King's Cross St. Pancras"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the first station: ");
        String firstStation = scanner.nextLine();
        System.out.print("Enter the name of the second station: ");
        String secondStation = scanner.nextLine();
        scanner.close();

        boolean found = false;
        for (Map.Entry<String, List<String>> entry : lines.entrySet()) {
            List<String> stations = entry.getValue();
            if (stations.contains(firstStation) && stations.contains(secondStation)) {
                System.out.println("The " + entry.getKey() + " line passes through " + firstStation + " and " + secondStation + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, there is no line that passes through both " + firstStation + " and " + secondStation + " in Zone 1.");
            scanner.close();//closing scanner
            }
        }

         //main method
    public static void main(String[] args) {
        //calling instance method into main method
        Pr_10_Zone1_StationsName obj = new Pr_10_Zone1_StationsName();
           obj.zone1Stations();
    }
}