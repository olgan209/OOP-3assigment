public class Main{
    public static void main(String[] args){
        PersonalAccount Olga = new PersonalAccount(1, "OlgaN");
        Olga.deposit(20000);
        Olga.withdraw(200);
        Olga.deposit(3000);
        Olga.deposit(4000);
        Olga.withdraw(5000);

        Olga.withdraw(200000);

        Olga.printTransactionHistory();
        System.out.println(Olga.getBalance());


    }
}