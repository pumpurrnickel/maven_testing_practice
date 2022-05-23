package test;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {

    }

    public static String wordOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        return input.nextLine();
    }

    public static String wordTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter another word: ");
        return input.nextLine();
    }
    
    public static String sameWord(String wordOne, String wordTwo) {
        if (wordOne.equals(wordTwo)) {
            return "They're the same word. Imagine that";
        } else {
            return "They're different words. What a wonder of the world.";
        }
    }
}
