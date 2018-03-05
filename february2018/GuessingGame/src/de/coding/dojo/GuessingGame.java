package de.coding.dojo;

/**
 * @author Max Crone
 * @since 15-9-2016.
 */
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Random;



/**
 * Plays a guessing game with the user
 * The program gives the user seven tries to find a randomly generated number on [0,100)
 * After the game is finished - the user has guessed the right number or spent his seven tries -
 * the program prints the guessing history in the form of a number line.
 */
public class GuessingGame {
    Scanner inputScanner = new Scanner(System.in);
    Random randomGenerator = new Random();
    ArrayList<Integer> guesses = new ArrayList<>();
    
	private static final Logger log4j = LogManager.getLogger(GuessingGame.class
	        .getName());
    

    /**
     * The randomly generated, secret number the user has to guess
     */
    int secret = randomGenerator.nextInt(100);

    /**
     * Contains the main game loop and most of the logic
     */
    public void run() {
    	
   	
        int guessesLeft = 7;
        int guess;

        /**
         * Keep asking for guesses until the user has no guesses left
         */
        while (guessesLeft > 0) {
        	log4j.info("Give me your number!");
            guess = inputScanner.nextInt();
            guesses.add(guess);

            /**
             * User has guessed the secret number
             */
            if (guess == secret) {
                System.out.println("Good guess! You won.");
                printGuessingHistory();
                break;
            }

            /**
             * User's guess is not the secret number0
             */
            if (secret > guess) {
            	log4j.warn("higher");
                System.out.println("higher");
            } else if (secret < guess) {
            	log4j.warn("lower");
                System.out.println("lower");
            }

            guessesLeft--;
            log4j.debug("Noch " + guessesLeft+ " Versuche");
        }

        /**
         * Finish the game if it ended because of the user not guessing the secret number in time
         */
        if (guessesLeft == 0) {
        	log4j.fatal("No more guesses, you lost");
            System.out.println("No more guesses, you lost");
            printGuessingHistory();
        }
    }

    /**
     * A helper function for run
     * Determines how to assemble the guessing history and prints it
     */
    private void printGuessingHistory() {
        String[] numberLines = new String[guesses.size()];

        /**
         * Loop over each guess to assemble the number line for it
         */
        for (int j = 0; j < guesses.size(); j++) {
            numberLines[j] = "";

            /**
             * Puts together the number line
             * 'X' indicates the user's guess
             * '|' indicates the secret number, this is overwritten by an 'X' if the user guessed the secret number
             * '.' indicates a generic point on the number line, without a guess or the secret number
             */
            for (int i = 0; i < 100; i++) {
                if (i == secret && guesses.get(j) != secret) {
                    numberLines[j] += "|";
                } else if (i == guesses.get(j)) {
                    numberLines[j] += "X";
                } else {
                    numberLines[j] += ".";
                }
            }
        }

        System.out.println(guesses.size() + " guesses:");
        for (String numberLine : numberLines) {
            System.out.println(numberLine);
        }
    }

    /**
     * Creates instance of GuessingGame and runs it
     * @param args
     */
    public static void main(String[] args) {
        (new GuessingGame()).run();
    	
    }
}
