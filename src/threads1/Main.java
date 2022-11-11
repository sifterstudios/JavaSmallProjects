package threads1;

public class Main {
    public static void main(String[] args) {
        var thread1 = new Thread(new InformalGreeter());
        var thread2 = new Thread(new FormalGreeter());

        thread1.start();
        thread2.start();

    }
}
