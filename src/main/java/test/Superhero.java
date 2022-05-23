package test;

import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {

        String hName = heroName();
        String hPower = heroPower();
        heroStory(hName, hPower);
    }

    public static String heroName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero");
        System.out.println("Who is the hero of our story?");
        return input.nextLine();
    }

    public static String heroPower() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is their superpower?");
        return input.nextLine();
    }

    public static String heroStory(String name, String power) {
        return "Little is known about the origins of " + name + " nor their true identity behind their persona. " + 
        "Some speculate that a terrible accident happened in a research facilitity, causing " + name + " to aquire their signature ability to " + power + ".";
    }
}
