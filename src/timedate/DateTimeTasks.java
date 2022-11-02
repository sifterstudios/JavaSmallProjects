package timedate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeTasks {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Scanner s = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy");

        System.out.println("What year are you born?");
        int birthYear = Integer.parseInt(s.nextLine());
        if (birthYear >= now.getYear()) {
            birthYear += 2000;
        } else if (birthYear < 100) {
            birthYear += 1900;
        }

        int age = now.getYear() - birthYear;

        System.out.println("You are " + age + " years old!");

    }
}
