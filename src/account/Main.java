package account;

import java.util.Scanner;

public class Main {
    static boolean isDone = false;
    static Scanner s = new Scanner(System.in);
    static Account account = new Account();

    public static void main(String[] args) {

        while (!isDone) {
            printMenu();
            int userChoice = Integer.parseInt(s.nextLine());
            switch (userChoice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> checkBalance();
                case 4 -> isDone = true;
            }
        }
    }

    private static void deposit() {
        System.out.println("How much do you want to deposit?");
        int amount = Integer.parseInt(s.nextLine());
        String message = account.deposit(amount) ? amount + " deposited." : "Deposit failed. Make sure deposit is below " + account.getMaxDeposit() + " and that the balance doesn't exceed " + account.getMaxBalance() + " after deposit.";
        System.out.println(System.lineSeparator() + message);
    }

    private static void withdraw() {
        System.out.println("How much do you want to withdraw?");
        int amount = Integer.parseInt(s.nextLine());
        String message = account.withdraw(amount) ? amount + " withdrawn." : "Insufficient funds, could not withdraw";
        System.out.println(System.lineSeparator() + message);
    }

    private static void checkBalance() {
        System.out.println("The balance currently is:");
        System.out.println(account.toString());
        isDone = true;
    }

    private static void printMenu() {
        clearScreen();
        System.out.println("1) Deposit");
        System.out.println("2) Withdraw");
        System.out.println("3) Check balance");
        System.out.println("4) Quit" + System.lineSeparator());
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
