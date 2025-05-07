class BankAccount {
    String number;
    int balance;
    Human owner;

    public void deposit(int add){
        balance += add;
    }

    public void withdraw(int add){
        balance -= add;
    }
}