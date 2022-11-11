package threads2;

public class AnnoyingGreeter implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Annoying Hello!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
