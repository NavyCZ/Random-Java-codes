public class Main {
    public static void main(String[] args) {
        Human karel = new Human();
        karel.name = "Karel";
        karel.age = 18;
        BankAccount karelAccount = new BankAccount();
        karelAccount.number = "980918";
        karelAccount.balance = 0;
        karelAccount.owner = karel;
        karel.account = karelAccount;

        Human franta = new Human();
        franta.name = "Franta";
        franta.age = 24;
        BankAccount frantaAccount = new BankAccount();
        frantaAccount.number = "100020";
        frantaAccount.balance = 0;
        frantaAccount.owner = franta;
        franta.account = frantaAccount;

        Bank rb = new Bank();
        rb.name = "Raiffeisenbank";
        rb.code = "5500";
        rb.accounts = new BankAccount[]{karelAccount, frantaAccount};

        karelAccount.deposit(10_000);
        frantaAccount.deposit(5_000);
        rb.deposit("980918", 10_000);
        rb.withdraw("100020", 500);

        rb.makePayment("980918", "100020", 100);

        rb.printClients();
    }
}