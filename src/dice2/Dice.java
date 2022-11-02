package dice2;

public abstract class Dice {

    int numberOfSides;

    public Dice(int numberOfSides) {
        if (numberOfSides < 1) this.numberOfSides = 1;
        if (numberOfSides > 20) this.numberOfSides = 20;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract int roll();
}
