package com.brittneyhughes.madlibs;

// [Start of Imports]
import java.util.Scanner;
// [End of Imports]

public class Main {
    public static void main(String[] args) {

        // [Initiate scanner]
        Scanner scanner = new Scanner(System.in);

        // [Variables]
        String nounOne;
        String nounTwo;
        String nounThree;
        String nounFour;
        String verbOne;
        String verbTwo;
        String verbThree;
        String verbFour;
        String adjectiveOne;
        String adjectiveTwo;
        String adjectiveThree;
        String adjectiveFour;
        String playAgain; // Variable for play again loop

        // [Play Again Loop Initiation]
        do {

        // [Introduction]
        System.out.println("Hello, welcome to my game of Mad Libs.");

        printSeparator();

        // [Nouns]
        System.out.println("First, you'll choose some nouns:");
        nounOne = readAnswer(scanner, "A type of animal: ");
        nounTwo = readAnswer(scanner, "A name: ");
        nounThree = readAnswer(scanner, "A food: ");
        nounFour = readAnswer(scanner, "A type of animal (plural): ");

        printSeparator();

        // [Verbs]
        System.out.println("Next, you'll choose some verbs (base form, like run, sing, or jump):");
        verbOne = readAnswer(scanner, "A verb: ");
        verbTwo = readAnswer(scanner, "Another verb: ");
        verbThree = readAnswer(scanner, "Another verb: ");
        verbFour = readAnswer(scanner, "Another verb: ");

        printSeparator();

        // [Adjectives]
        System.out.println("Finally, you'll choose some adjectives:");
        adjectiveOne = readAnswer(scanner, "A color: ");
        adjectiveTwo = readAnswer(scanner, "A texture: ");
        adjectiveThree = readAnswer(scanner, "A flavor: ");
        adjectiveFour = readAnswer(scanner, "A size: ");

        printSeparator();

        // [Conclusion]
        System.out.println("Thanks! Now, on to our story. Enjoy!");
        System.out.println();

        // [Story]
        System.out.println("********************");
        System.out.println("THE GREAT ZOO ESCAPE");
        System.out.println("********************");
        System.out.println();

        System.out.println("Every Tuesday, " + nounTwo + " the " + adjectiveOne
                + " " + nounOne + " tried to escape from the zoo.");

        System.out.println("The plan was always the same: " + verbOne
                + " until the zookeeper got distracted, then " + verbTwo
                + " straight through the front gate.");

        System.out.println("But this Tuesday, something was different.");

        System.out.println("Someone had left a " + adjectiveTwo
                + " hat beside the gate, with a note that read: \"DO NOT EAT.\"");

        System.out.println("Naturally, " + nounTwo + " took a bite.");

        System.out.println("\"Hmm. It tastes " + adjectiveThree
                + ". I should have packed my emergency " + nounThree + " instead.\"");

        System.out.println("An alarm went off. A group of " + adjectiveFour
                + " " + nounFour + " came charging around the corner.");

        System.out.println("\"THAT WAS OUR HAT!\" they shouted.");

        System.out.println(nounTwo + " tried to " + verbThree
                + " as an apology, but that only made things worse.");

        System.out.println("There was only one option left: " + verbFour
                + " until the zookeeper arrived.");

        System.out.println("The escape was canceled. The hat was confiscated.");

        System.out.println(nounTwo + " is now banned from wearing hats."
                + " And eating them.");

        printSeparator();

        // [Replay prompt]
        playAgain = readAnswer(scanner, "Would you like to play again? (yes/no): ");

        // [Play Again Loop Conclusion]
        } while (playAgain.equalsIgnoreCase("yes"));

        // [End]
        System.out.println("Thanks for playing!");
        scanner.close();
        }

    // [Method to Prevent Blank Answers]
    public static String readAnswer(Scanner scanner, String prompt) {
        String answer;
         do {
             System.out.print(prompt);
             answer = scanner.nextLine().trim();

             if (answer.isEmpty()) {
                 System.out.println("Please enter an answer.");
             }
         } while (answer.isEmpty());

        return answer;
    }

    // [Method to Print Separator]
    public static void printSeparator() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
    }
}
