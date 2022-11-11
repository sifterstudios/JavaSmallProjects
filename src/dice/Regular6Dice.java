package dice;

import java.util.Random;

public class Regular6Dice extends Dice {

    public Regular6Dice() {
        super(6);
    }

    @Override
    public int roll() {
        return (new Random().nextInt(1, 6));
    }
}


