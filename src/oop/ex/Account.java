package oop.ex;

public class Account {
    int balance;
    String name;


    int getBalance() {
        return balance;
    }
    void deposit(int amount) {
        System.out.println("입금: "+amount);
        balance += amount;
    }
    void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("출금: "+amount);
            balance -= amount;
            System.out.println("남은 잔액: "+balance);
        }
        else {
            System.out.println("잔액 부족");
        }
    }
}
