package com.Jokrish.operators;

public class Challenge {
    public static void main(String[] args) {
        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double total = (firstNumber + secondNumber) * 100.00d;
        System.out.println("Total  : "+total);
        double remainder = total % 40.00d;
        System.out.println("Remainder : "+remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);
        if(!isNoRemainder){
            System.out.println(" Got some remainder");
        }

    }
}
