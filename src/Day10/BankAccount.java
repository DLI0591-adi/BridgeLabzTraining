package Day10;

public class BankAccount {
    private int acno;
    private double balance;

    public synchronized void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+ " withdrawn "+ amount);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" low balance");
        }
    }
    public synchronized void deposit(double amount){
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+" deposited "+amount);
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        Runnable deposit=() ->{
            for(int i=0;i<3;i++){
                b1.deposit(200);
            }
        };
        Runnable withdraw=() -> {
            for(int i=0;i<3;i++){
                b1.withdraw(100);
            }
        };
        Thread p1=new Thread(deposit,"Person 1");
        Thread p2=new Thread(deposit,"Person 2");
        Thread p3=new Thread(withdraw,"Person 3");
        p1.start();
        p2.start();
        p3.start();
    }
}
