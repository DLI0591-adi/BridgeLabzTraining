package Day8;

public class BankingSystem {
    private double balance;
    BankingSystem(double balance){
        this.balance=balance;
    }
    void addAmount(double amount){
        this.balance+=amount;
    }
    double getBalance(){
        return this.balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException {
        if(this.balance<amount){
            throw new InsufficientBalanceException("amount entered is larger than balance");
        }
        this.balance-=amount;
    }

    public static void main(String[] args) throws InsufficientBalanceException {
        BankingSystem b1=new BankingSystem(2500.65);
        double withDraw=2600.23;
        System.out.println(b1.getBalance());
        b1.withdraw(withDraw);
    }
}

