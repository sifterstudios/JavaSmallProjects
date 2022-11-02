package dice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int iterations = 100000;
        int sum = 0;

        List<Dice> allTheDice = new ArrayList<>();
        List<Integer> results = new ArrayList<>();

        IntStream.rangeClosed(1, 50000).forEach(i -> allTheDice.add(new Regular6Dice()));
        IntStream.rangeClosed(1, 50000).forEach(i -> allTheDice.add(new Cheat8Dice()));

        for (int i = 0; i < iterations; i++) {
            var diceNumber = allTheDice.get(i).roll();
            results.add(diceNumber);
        }

        for (Integer result : results) sum += result;

        double averageRollValues = (double) sum / iterations;

        System.out.println("Average: " + averageRollValues);
    }
}

