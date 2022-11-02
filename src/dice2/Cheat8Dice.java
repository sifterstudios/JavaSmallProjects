package dice2;

import java.util.Random;

public class Cheat8Dice extends Dice {

    public Cheat8Dice() {
        super(8);
    }

    @Override
    public int roll() {
        return new Random().nextInt(1, 11) <= 2 ? 1 : 8;
    }
}
