package Day11_oops.Account;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if(initialBalance > 0.0){
            balance = initialBalance;
        }
    }

    public void credit (double amount){
        System.out.println("Amount credited succesfully : " + amount);
        balance += amount;
        System.out.println("Your total balance is : " +  getBalance());
    }

    public void debit (double amount){
        if(amount > balance){
            System.out.println("Debit amount exceeded account balance.");
        }else{
            balance = balance - amount;
            System.out.println("Your total balance is : " +  getBalance());
        }
    }

    public double getBalance() {
        return balance;
    }
}
