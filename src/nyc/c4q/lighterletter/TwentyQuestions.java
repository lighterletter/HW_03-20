package nyc.c4q.lighterletter;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by John Gomez on 3/16/15.
 * Hw for 3-20.
 * Program asks the user to guess a number between 1 and 100,000
 * if the user's guess is too low the program lets the user know,
 * Same if the user guess is too high. User gets only 20 chances.
 *
 */
public class TwentyQuestions {

    public static void print(String text){
        System.out.println(text);
    }

    public static void main(String [] args){
        Scanner guess = new Scanner(System.in);

        print("Guess a number between 1 and 100,000.");


        int numB = new Random().nextInt(100001);

        int input;

        for (int Q = 20; Q >=1; Q--) {
           print("tries left:"+ Q);

                input = guess.nextInt();

                if (input == numB) {
                    print("You got it!");
                    return;

                } if (input < numB) {
                    print("Too low!");


                } if (input > numB) {
                    print("Too high!");


                }

        }
        print("no more tries!");



    }


}
