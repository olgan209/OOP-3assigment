public class Amount {
    private double amount;
    public TransactionType transactionType;

    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public String toString() {
        return amount + " " + transactionType;
    }
}
