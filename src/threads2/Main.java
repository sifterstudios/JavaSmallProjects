package threads2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var annoying = new Thread(new Thread(new AnnoyingGreeter()));
        annoying.start();
        System.out.println("Hello from main method");
        Thread.sleep(5000);
        annoying.interrupt();
    }
}
