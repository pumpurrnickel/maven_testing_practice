package test;
import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        
        int in = input();
        System.out.println(IsBoiling(in));

    }

    public static int input() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 212: ");
        return input.nextInt();

    }

    public static String IsBoiling(int numb) {

        if (numb > 212) {
             return "Water is boiling";
        } else {
            return "...I said to enter a number greater than 212 :/";
        }
    }
}

