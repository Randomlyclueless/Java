// 6. ATM Machine

// Use private variables for:

// PIN
// balance

// Allow access only through methods.


import java.util.Scanner;

class Practice7 {

    static class ATM {

        private int pin;
        private double balance;

        // Constructor
        ATM(int pin, double balance) {
            this.pin = pin;
            this.balance = balance;
        }

        // Validate PIN
        boolean validatePin(int enteredPin) {
            return this.pin == enteredPin;
        }

        // Deposit
        void deposit(double amount) {
            balance += amount;
            System.out.println("Amount Deposited");
        }

        // Withdraw
        void withdraw(double amount) {

            if(amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw Successful");
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }

        // Show Balance
        void showBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM user = new ATM(1234, 5000);

        System.out.println("Enter PIN:");
        int enteredPin = sc.nextInt();

        // Execution starts here
        if(user.validatePin(enteredPin)) {

            System.out.println("PIN Verified");

            user.showBalance();

            user.deposit(2000);

            user.showBalance();

            user.withdraw(3000);

            user.showBalance();
        }
        else {
            System.out.println("Wrong PIN");
        }
    }
}