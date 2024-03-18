package Day11_oops.Account;

import java.util.Scanner;

public class Account_Test {
    public static void main(String[] args) {
        Account ac1 = new Account(50000);
        Account ac2 = new Account(50000);

        System.out.println("Account1 Available balance is : " + ac1.getBalance());
        System.out.println("Account2 Available balance is : " + ac2.getBalance());

        System.out.println("Credit amount");
        ac1.credit(45000);
    }
}
