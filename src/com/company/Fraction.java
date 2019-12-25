package com.company;

import java.util.Scanner;

public class Fraction {
    int numerator,denomenator;

    public Fraction(){
        numerator =1;
        denomenator = 0;
    }

    public Fraction(int numerator, int denomenator){
        this.numerator = numerator;
        this.denomenator = denomenator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denomenator=" + denomenator +
                '}';
    }

    public void nextFraction(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int den = scanner.nextInt();
        if (den == 0){
            System.out.println("NOT NULL");
            return;
        }
        numerator = num;
        denomenator = den;
    }

    public void add (Fraction another){
        numerator = numerator * another.denomenator + another.numerator *denomenator;
        denomenator = denomenator * another.denomenator;
        reduce();
    }

    public void add( int n ){
        add(new Fraction(n, 1));
    }

    public void substract(Fraction another){
        numerator = numerator * another.denomenator - another.numerator*denomenator;
        denomenator = denomenator * another.denomenator;
        reduce();
    }

    public void substract(int n){
        substract(new Fraction(n,1));
    }


    public void multiply(Fraction another){
        numerator = numerator* another.numerator;
        denomenator = denomenator * another.denomenator;
        reduce();
    }

    public void multiply(int n){
        multiply(new Fraction(n, 1));
    }

    private void reduce() {
        int t = getGCD(numerator,denomenator);
        numerator /= t;
        denomenator /= t;
    }

    private int getGCD(int numerator, int denomenator) {
        int result = denomenator==0? numerator: getGCD(denomenator, numerator%denomenator);

        return result;
    }




}
