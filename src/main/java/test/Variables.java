package test;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        String str = enterString();
        int inter = enterInterger();
        double d = enterDouble();
        boolean b = enterBoolean();

        output(str, inter, d, b);
    }

    public static int enterInterger() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an interger: ");
        return input.nextInt();
    }

    public static String enterString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        return input.nextLine();
    }

    public static double enterDouble() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double: ");
        return input.nextInt();
    }

    public static boolean enterBoolean() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a boolean: ");
        return input.nextBoolean();
    }

    public static String output(String string, int interger, double doub, boolean bool) {
        return "Your string is " + string + "." +
        " Your interger is " + interger + "." +
        " Your double is " + doub + "." +
        " Your boolean is " + bool + ".";
    }
}
