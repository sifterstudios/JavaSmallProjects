package threads3;

public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {

        }
        System.out.println("Hello From Greeter!");
    }
}
