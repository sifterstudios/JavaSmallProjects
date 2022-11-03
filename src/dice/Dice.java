package dice;

import java.awt.font.NumericShaper;
import java.util.Random;
import java.util.random.RandomGenerator;

public abstract class Dice {
    int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        if (numberOfSides < 1) {
            numberOfSides = 1;
        } else if (numberOfSides > 20) {
            numberOfSides = 20;
        }
    }

    public abstract int roll();

    public int getNumberOfSides() {
        return numberOfSides;
    }
}

