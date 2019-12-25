package com.company;

public class Main {

    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        a.nextFraction();
        b.nextFraction();
        a.add(b);
        b.substract(new Fraction(1,3));
        System.out.println(b);
        System.out.println(a);
    }
}
