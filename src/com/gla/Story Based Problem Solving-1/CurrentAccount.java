class CurrentAccount extends Account {

    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02;   // 2% interest
    }
}