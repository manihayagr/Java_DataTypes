package com.Jokrish.conditionalLogic_35;

public class IfElseAndTernary {
    public static void main(String[] args) {
        int marksScored = 99;
        String status = "";

        if(marksScored == 100) {
            status = "Distinction";
          }
        else {
            status = "No Distinction";
        }
         System.out.println(status);
    //Ternary operator
    status = (marksScored == 100)?"Distinction":"No Distinction";
    System.out.println("Ternary Status  : "+status);


    }
}
