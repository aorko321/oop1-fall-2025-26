package Project;

import java.util.Scanner;

public class MortgageCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    double salary = getValidDouble(sc, "Enter your monthly salary: ");
    double score = getValidCreditScore(sc, "Enter credit score: ");
    boolean criminalRecord = getValidBoolean(sc, "Do you have a criminal record? (True/False)");
    
    boolean eligible = true;
    if (score<300 || criminalRecord) {eligible = false;
        System.out.println("Sorry, you are not eligible for a loan.");
        System.out.println("Reason: You must have credit score over 300 and no criminal record.");}

    if (eligible){
    double principal = getValidDouble(sc, "Enter loan amount: ");
    if (principal > salary * 2) {
        System.out.println("Loan request denied.");
        System.out.println("Reason: Loan amount must be under 2 times your salary.");
    } else {
    double annualInterestRate = getValidDouble(sc, "Enter annual interest rate (in %): ");
    double monthlyInterestRate = annualInterestRate/1200;
    int years = getValidInt(sc, "Enter loan term in year(s): ");
    int numberOfPayments = years*12;
    double numerator = principal*monthlyInterestRate;
    double denominator = 1 - Math.pow(1+monthlyInterestRate, -numberOfPayments);
    double monthlyPayment = numerator/denominator;
    System.out.println("Your monthly payment is: $" + monthlyPayment);}
    }
}

private static double getValidDouble(Scanner sc, String message){
    while(true){
    System.out.print(message);
    if(sc.hasNextDouble()) {return sc.nextDouble();}
    else{System.out.println("Invalid input! Please enter a numeric value.");
        sc.next();}
        }
    }


private static double getValidCreditScore(Scanner sc, String message){
    while(true){
    System.out.print("Enter your credit score (0 - 500): ");
        if (sc.hasNextDouble()) {
        double score = sc.nextDouble();
            if (score >= 0 && score <= 500) {return score;}
            else {System.out.println("Credit score must be between 0 and 500.");}
            }
            else{System.out.println("Invalid input! Please enter a numeric value between 0 and 800.");
                sc.next();}
        }
    }

 
private static boolean getValidBoolean(Scanner sc, String message) {
    while(true){
        System.out.print(message);
        if (sc.hasNextBoolean()) {return sc.nextBoolean();}
        else {System.out.println("Invalid input! Please type 'true' or 'false'.");
            sc.next();}
        }
    }


private static int getValidInt(Scanner sc, String message) {while(true){
        System.out.print(message);
            if (sc.hasNextInt()) {return sc.nextInt();}
        else {System.out.println("Invalid input! Please enter a whole number.");
                sc.next();}
        }
    }


}