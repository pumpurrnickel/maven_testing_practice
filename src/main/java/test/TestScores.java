package test;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        int testScore = input();
        System.out.println(testScore(testScore));
    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String testScore(int test) {

        if (test >= 100) {
            return "Yeah yeah alright, we got little Einstein over here flexing their perfect score and more.";
        } else if (test >= 90) {
            return "An 'A'...not bad. But a " + test + " isn't exactly a 100.";
        } else if (test >= 80) {
            return "Your grade is a 'B', huh? Most people would say that 'B' stands for 'Be better'...and they would be right.";
        } else if (test >= 70) {
            return "Lots of words start with 'C', like 'calculus' or 'cucumber'...or even phrases like 'Check your answers more often.'";
        } else if (test >= 60) {
            return "Y'know, a 'D' really isn't that bad. But it's still bad, though.";
        } else if (test >= 50) {
            return "That's a pretty big 'F' if I've ever seen one. I always wondered why we skip 'E' for grading. ";
        } else if (test >= 0) {
            return "It's actually substantially impressive that you managed to get a score that low.";
        } else {
            return "You probably just entered that in wondering what I'd say about it. Maybe you should enter in the Guinness World Records for 'lowest test score ever recorded in human history' or 'biggest clown since Ronald McDonald'.";
        }

    }
}
