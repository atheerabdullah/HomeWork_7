public class Account {
    private String id;
    private String name;
    private double balance;
    private int amount ;


    // Constructor

    public Account() {
        balance = 1000; // they have 500 on both accounts 500SR
    }


    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // method or beehive

    public void debit(int amount) {
        balance = balance + amount;

    }

    public void credit(int amount) {
        if (balance==0) {
            System.out.println("your balance : " + balance);
        }
        else {
            balance = balance - amount;
        }

    }

   public void transferTo(int amount, Account another) {
        if (balance >= amount) {
            credit(amount);
            another.debit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer Failed");
        }
    }



}
