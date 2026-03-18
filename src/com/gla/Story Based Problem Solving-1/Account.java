class Account {
    int accountNumber;
    double balance;

    static String bankName = "ABC Bank";  // shared by all accounts

    // Constructor
    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to calculate interest
    double calculateInterest() {
        return 0;
    }
}