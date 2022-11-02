package hexadecimals;

import java.math.BigDecimal;

public class hexadecimals {
    public static void main(String[] args) {
        double amount = 0;
        amount += 0.1f; // Same thing as: amount = amount + 0.1f
        amount += 0.1f;
        amount += 0.1f;
        amount += 0.1f;
        amount += 0.1f;
        amount += 0.1f;
        amount += 0.1f;
        amount += 0.1f;
        amount += 0.1f;
        amount += 0.1f;
        BigDecimal test = new BigDecimal(amount);
        System.out.println(amount);
        System.out.println(test);
    }
}

