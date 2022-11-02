package arraysIO;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> cityAndPopulation = new HashMap<>();

        System.out.println("How many cities do you want to register? ");
        int numberOfCities = Integer.parseInt(s.nextLine());

        getCityAndPopulationFromUser(numberOfCities, cityAndPopulation);
        var sortedCityAndPopulation = sortMapByPopulationDesc(cityAndPopulation);
        System.out.println("This is what you inputted, sorted by population (Highest to lowest)!");

        printCityOverview(sortedCityAndPopulation);


    }

    private static void printCityOverview(Map<String, Integer> sortedCityAndPopulation) {
        int printCount = 0;
        while (printCount != sortedCityAndPopulation.size()) {
            for (Map.Entry<String, Integer> entry : sortedCityAndPopulation.entrySet()) {
                String printCity = parseCityName(entry.getKey());
                String printPopulation = parseCityPopulation(entry.getValue());
                System.out.println((printCount + 1) + ": " + printCity + printPopulation);
                printCount++;
            }
        }
    }

    private static String parseCityPopulation(Integer population) {
        int numberOfAngleBrackets = population / 50000;

        return ">".repeat(Math.max(0, numberOfAngleBrackets)) + population;
    }

    private static String parseCityName(String entry) {

        if (entry.length() > 10) {
            StringBuilder abbr = new StringBuilder();
            for (int i = 0; i < 7; i++) {
                abbr.append(entry.charAt(i));
            }
            abbr.append("...");
            return abbr.toString();
        }

        return entry + " ".repeat(10 - entry.length());
    }

    private static Map<String, Integer> sortMapByPopulationDesc(Map<String, Integer> map) {
        var sortedMap = new HashMap<String, Integer>();
        var sortedPopulation = new ArrayList<Integer>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sortedPopulation.add(entry.getValue());
        }
        Collections.sort(sortedPopulation);
        Collections.reverse(sortedPopulation);

        // Search for a match in map and add to sortedMap in descending order
        for (int num : sortedPopulation) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }

        return sortedMap;
    }

    private static void getCityAndPopulationFromUser(int amount, Map<String, Integer> map) {
        int counter = 0;
        Scanner s = new Scanner(System.in);
        while (counter != amount) {

            System.out.println("Name of City #" + (counter + 1));
            String cityName = s.nextLine();

            System.out.println("How many inhabitants are there in " + cityName + "?");
            int population = Integer.parseInt(s.nextLine());

            map.put(cityName, population);
            counter++;
        }

    }


}
