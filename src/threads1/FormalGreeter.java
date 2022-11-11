package threads1;

public class FormalGreeter implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello!");
        }
    }
}
