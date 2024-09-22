public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private Amount[] transactions;
    private int transactionCount;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[1000];
    }

    public void deposit(double amount) {
        Amount depositTransaction = new Amount(amount, TransactionType.DEPOSIT);
        if(transactionCount < transactions.length) {
            transactions[transactionCount] = depositTransaction;
            transactionCount++;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        Amount withdraw = new Amount(amount, TransactionType.WITHDRAWAL);
        if(transactionCount < transactions.length) {
            if(withdraw.getAmount() <= amount) {
                transactions[transactionCount] = withdraw;
                transactionCount++;
                this.balance -= amount;
            }
            else {
                System.out.println("You don't have enough money to withdraw");
            }
        }
    }

    public void printTransactionHistory() {
        for(int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }
}

//void printTransactionHistory():
//
//A method to print the transaction history of the account. Iterate through the transactions array and display each transaction, including the transactionType and amount.
//double getBalance():
//
//A method to retrieve the current balance of the account.
//int getAccountNumber():
//
//A method to retrieve the account number.
//String getAccountHolder():
//
//A method to retrieve the account holder's name.