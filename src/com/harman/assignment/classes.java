package com.harman.assignment;

abstract class parent {
    void message(){}
}


class sub1 extends parent {
    void message() {
        System.out.println("This is the First subclass.");
    }
}

class sub2 extends parent {
    void message() {
        System.out.println("This is the Second class.");
    }
}

public class classes {
    public static void main(String[] args) {
        sub1 sobj1 = new sub1();
        sub2 sobj2 = new sub2();
        sobj1.message();
        sobj2.message();

    }
}