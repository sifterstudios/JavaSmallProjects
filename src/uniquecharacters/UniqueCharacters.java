package uniquecharacters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please write something: ");
        String answer = s.nextLine();

        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < answer.length(); i++) {
            chars.add(answer.charAt(i));
        }

        System.out.println("The number of characters: " + answer.length());
        System.out.println("The number of unique characters: " + chars.size());
    }
}
