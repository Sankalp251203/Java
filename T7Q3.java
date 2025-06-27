public class T7Q3 {

    // Shared BankAccount class
    static class BankAccount {
        private int balance = 1000;

        // Synchronized method to deposit money
        public synchronized void deposit(int amount, String threadName) {
            System.out.println(threadName + " attempting to deposit $" + amount);
            int newBalance = balance + amount;
            try {
                Thread.sleep(100); // Simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
            System.out.println(threadName + " completed deposit. New balance: $" + balance);
        }

        public int getBalance() {
            return balance;
        }
    }

    // Runnable task that performs deposit
    static class DepositTask implements Runnable {
        private BankAccount account;
        private int amount;
        private String threadName;

        public DepositTask(BankAccount account, int amount, String threadName) {
            this.account = account;
            this.amount = amount;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            account.deposit(amount, threadName);
        }
    }

    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        // Create two deposit tasks using the same account
        Thread t1 = new Thread(new DepositTask(sharedAccount, 500, "Thread-1"));
        Thread t2 = new Thread(new DepositTask(sharedAccount, 700, "Thread-2"));

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance check
        System.out.println("Final balance: $" + sharedAccount.getBalance());
    }
}
