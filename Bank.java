class Bank {
    String name;
    String code;
    BankAccount[] accounts;

    public void deposit(String code, int add){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].number == code){
                accounts[i].balance += add;
            }
        }
    }
    public void withdraw(String code, int add){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].number == code){
                accounts[i].balance -= add;
            }
        }
    }
    public void makePayment(String acc1, String acc2, int amount){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].number.equals(acc1)){
                accounts[i].balance -= amount;
            }
            if (accounts[i].number.equals(acc2)){
                accounts[i].balance += amount;
            }
        }
    }
    public void printClients() {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].owner.name +" - "+ accounts[i].balance);
        }
    }
}
