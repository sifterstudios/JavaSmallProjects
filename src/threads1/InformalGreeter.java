package threads1;

public class InformalGreeter implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("Hey!");
        }
    }
}
