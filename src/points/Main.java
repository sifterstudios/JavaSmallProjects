package points;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        //userControlledVersion();
        //computerPointListFromOrigo();
        computerControlledLineLengthCheck();
    }

    private static void computerControlledLineLengthCheck() {
        Line lineA = new Line(new Punkt(3, 3), new Punkt(5, 5));
        Line lineB = new Line(new Punkt(-3, -3), new Punkt(3, 3));

        int check = checkLength(lineA, lineB);
        switch (check) {
            case -1 -> System.out.println("Line B is longer than line A");
            case 0 -> System.out.println("The lines have equal lengths");
            case 1 -> System.out.println("Line A is longer than line B");
        }
    }

    private static int checkLength(Line lineA, Line lineB) {
        Punkt punktA = lineA.getPointA();
        Punkt punktB = lineA.getPointB();
        Punkt punktC = lineB.getPointA();
        Punkt punktD = lineB.getPointB();

        return Double.compare(punktA.distance(punktB), punktC.distance(punktD));
    }

    private static void computerPointListFromOrigo() {
        var pointList = new Punkt[10];
        for (int i = 0; i < pointList.length; i++) {
            pointList[i] = new Punkt(i + 1, i + 1);
        }
        for (Punkt punkt : pointList) {
            System.out.println(punkt.toString());
        }
    }

    private static void userControlledVersion() {
        final String[] answers = getAnswersFromUser();

        final Punkt point1 = stringToPunkt(answers[0]);
        final Punkt point2 = stringToPunkt(answers[1]);

        final double distance = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);
    }

    private static Punkt stringToPunkt(String s) {
        try {
            if (s.equals(System.lineSeparator())) {
                return new Punkt();
            }
            String[] split = s.split(",");
            return new Punkt(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        } catch (PatternSyntaxException e) {
            System.out.println("Could not read those numbers. Please try again:");
            getAnswersFromUser();
        }
        return new Punkt();

    }

    private static String[] getAnswersFromUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the point calculator...!");
        System.out.println("Please enter point 1 (x,y)");
        var answer1 = s.nextLine();
        System.out.println("OK. Now enter point 2 (x,y)");
        var answer2 = s.nextLine();
        return new String[]{answer1, answer2};
    }

}

