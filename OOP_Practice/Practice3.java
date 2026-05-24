import java.util.Scanner;

class Practice3 {

    static class BankAccount {

        int existingMoney;

        BankAccount(int existingMoney) {
            this.existingMoney = existingMoney;
        }

        void deposit(int money) {
            existingMoney += money;
            System.out.println("Money Deposited Successfully");
        }

        void withdraw(int money) {

            if (money > existingMoney) {
                System.out.println("Insufficient Balance");
            } else {
                existingMoney -= money;
                System.out.println("Money Withdrawn Successfully");
            }
        }

        int checkBalance() {
            return existingMoney;
        }
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        BankAccount acc1 = new BankAccount(1000);

        boolean running = true;

        while (running) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = myObj.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = myObj.nextInt();

                    acc1.deposit(depositAmount);

                    break;

                case 2:

                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = myObj.nextInt();

                    acc1.withdraw(withdrawAmount);

                    break;

                case 3:

                    System.out.println("Current Balance: " + acc1.checkBalance());

                    break;

                case 4:

                    running = false;
                    System.out.println("Thank You for Using the Bank System");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }
        }

        myObj.close();
    }
}