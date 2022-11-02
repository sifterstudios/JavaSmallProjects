package hellouser;

import java.util.Scanner;

public class hellouser {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        
        System.out.println("How many hobbies do you have, " + name + " ");
        int numberOfHobbies = s.nextInt();
        s.nextLine();

        String[] hobbies = new String[numberOfHobbies];

        for (int i = 0; i < hobbies.length; i++) {
            System.out.print("What's the name of hobby #" + (i + 1) + "? ");
            hobbies[i] = s.nextLine();
        }
        System.out.println("Great! Here's a list of your hobbies: (enter to go to next)");

        for (String hobby : hobbies) {
            System.out.print(hobby);
            s.nextLine();
        }

    }
}
