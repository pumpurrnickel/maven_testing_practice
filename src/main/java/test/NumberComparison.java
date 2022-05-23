package test;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

    int numbOne = numbOne();
    int numbTwo = numbTwo();
    System.out.println(Compariston(numbOne, numbTwo));
        
    }

    public static int numbOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return input.nextInt();
    }

    public static int numbTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter another number: ");
        return input.nextInt();
    }

    public static String Compariston(int numbOne, int numbTwo) {

        if (numbOne > numbTwo) {
            return numbOne + " is greater than " + numbTwo;
        } else if (numbOne == numbTwo) {
            return "Both numbers are equal.";
        } else{
            return numbOne + " is less than " + numbTwo;
        }
    }

}
