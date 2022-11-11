package threads3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var greeter = new Thread(new Runnable());
        greeter.start();
        System.out.println("Hello from Main");
//        greeter.join();
        System.out.println("Hello from Main again");
    }
}
