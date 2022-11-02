package shoppinglist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean doneInputting = false;
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        while (!doneInputting) {
            System.out.printf("What do you need to buy?");
            items.add(s.nextLine());
            System.out.printf("How many?");
            count.add(Integer.valueOf(s.nextLine()));
            System.out.printf("Any more items? (y/n)");
            doneInputting = !s.nextLine().equals("y");
        }
        System.out.println("How do you want the numbers printed? (ENTER for numbers)");
        String symbol = s.nextLine();


        for (int i = 0; i < items.size(); i++) {
            if (symbol.isEmpty()) {
                System.out.printf("%s: %s%n", items.get(i), count.get(i));
            } else {
                System.out.printf("%s: %s%n", items.get(i), symbol.repeat(count.get(i)));
            }
        }
    }
}
