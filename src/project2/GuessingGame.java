/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Jaman500
 * This is the "I'm thinking of a number between 1 and 100" game. Enjoy it.
 */

import java.util.*;
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100) +1; //The random number. Parameters [1-101)
        int numGuess = 0; //The Total number of guesses
        int high = 0; //The number of times the user guesses too high
        int low = 0; //The numner of times the user guesses too low
        int guess = 0; //The user's guess
        
        System.out.println("I'm thinking of a number between 1 and 100. What's your guess?");
        while(guess != -1) //if guess is -1, exit the program
        {
            guess = sc.nextInt();
            if(guess == -1)
                break;
            numGuess++;     //add to numGuess
            if(guess > 100)
            {
                System.out.println("uummmmm.... 1-100, dude...");
            }
            else if(guess < 1)
            {
                System.out.println("uummmm... 1-100, dude...");
            }
            else if(guess > num) //if guess is too high: tell the user and add to high
            {
                System.out.println("Too high. Guess again!");
                high++;
            }
            else if(guess < num) //If the guess is too low: tell the user and add to low
            {
                System.out.println("Too low. Guess again!");
                low++;
            }
            else //if it's the correct number: tell the user and break out of loop
            {
                System.out.println("Correct!");
                break;
            }
        }
        //Tell the user their stats!
        System.out.println("Total guesses: " +numGuess);
        System.out.println("Larger guesses: " +high);
        System.out.println("Smaller guesses: "+low);
        
    }
    
}
