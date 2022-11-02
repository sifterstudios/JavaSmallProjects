package ascii;

public class ascii {
    public static void main(String[] args) {
        int maxNumber = 60000;
        int rowNumber = 0;
        System.out.println("HERE WE GO!");
        for (int i = 0; i < maxNumber; i++) {
            if (rowNumber == 40) {
                rowNumber = 0;
                System.out.println();
            }
            System.out.printf("%5c", (char) i);
            rowNumber++;
        }
    }
}
