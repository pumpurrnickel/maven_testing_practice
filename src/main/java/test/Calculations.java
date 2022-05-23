package test;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");
        int numOne = input();

        System.out.println("Enter another number: ");
        int numTwo = input();

        output(numOne, numTwo);
        
    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int Addition(int numbOne, int numbTwo) {
        return numbOne + numbTwo;
    }

    public static int Substraction(int numbOne, int numbTwo) {
        return numbOne - numbTwo;
    }

    public static int Multiplication(int numbOne, int numbTwo) {
        return numbOne * numbTwo;
    }

    public static double Division(int numbOne, int numbTwo) {
        return (double)numbOne / (double)numbTwo;
    }

    public static int Modulus(int numbOne, int numbTwo) {
        return numbOne % numbTwo;
    }

    public static void output(int numbOne, int numbTwo) {

        int additionMeth = Addition(numbOne, numbTwo);
        int subtractionMeth = Substraction(numbOne, numbTwo);
        int multipliationMeth = Multiplication(numbOne, numbTwo);
        double divisionMeth = Division(numbOne, numbTwo);
        int modulusMeth = Modulus(numbOne, numbTwo);

        System.out.println(numbOne + " + " + numbTwo + " = " + additionMeth);
        System.out.println(numbOne + " + " + numbTwo + " = " + subtractionMeth);
        System.out.println(numbOne + " + " + numbTwo + " = " + multipliationMeth);
        System.out.println(numbOne + " + " + numbTwo + " = " + divisionMeth);
        System.out.println(numbOne + " + " + numbTwo + " = " + modulusMeth);

    }
}
