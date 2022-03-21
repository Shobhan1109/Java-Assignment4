package com.harman.assignment;

public interface Bank {
    void getbalance();
}
class BankA implements Bank{
    public void getbalance() {
        System.out.println("Deposited: 100$.");
    }
}
class BankB implements Bank{
    public void getbalance() {
        System.out.println("Deposited: 150$.");
    }
}
class BankC implements Bank{
    public void getbalance() {
        System.out.println("Deposited: 200$.");
    }
}
class balance {
    public static void main(String[] args) {
        BankA b1=new BankA();
        BankB b2=new BankB();
        BankC b3=new BankC();
        b1.getbalance();
        b2.getbalance();
        b3.getbalance();
    }
}