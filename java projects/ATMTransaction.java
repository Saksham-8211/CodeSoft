import java.io.*;
import java.util.Scanner;

public class ATMTransaction {

    public static void displayBalance(int balance) {
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    public static int amountWithdrawing(int balance, int withdrawnAmount) {
        System.out.println("Withdraw operation:");
        System.out.println("Withdrawn Amount: " + withdrawnAmount);
        if (balance >= withdrawnAmount) {
            balance = balance - withdrawnAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        } else {
            System.out.println("Sorry! Insufficient funds");
            System.out.println();
        }
        return balance;
    }

    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("Deposit operation:");
        System.out.println("Deposit Amount: " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current balance: ");
        int balance = scanner.nextInt();

        System.out.print("Do you want to withdraw money? (yes/no): ");
        String withdrawResponse = scanner.next();

        if (withdrawResponse.equalsIgnoreCase("yes")) {
            System.out.print("Enter amount to withdraw: ");
            int withdrawnAmount = scanner.nextInt();
            balance = amountWithdrawing(balance, withdrawnAmount);
        } else {
            System.out.println("No withdraw operation selected.");
            displayBalance(balance);
        }

        System.out.print("Do you want to deposit money? (yes/no): ");
        String depositResponse = scanner.next();

        if (depositResponse.equalsIgnoreCase("yes")) {
            System.out.print("Enter amount to deposit: ");
            int depositAmount = scanner.nextInt();
            balance = amountDepositing(balance, depositAmount);
        } else {
            System.out.println("No deposit operation selected.");
            displayBalance(balance);
        }

        scanner.close();
    }
}
