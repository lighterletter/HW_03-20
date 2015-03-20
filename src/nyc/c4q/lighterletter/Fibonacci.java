package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by John Gomez on 3/18/15.
 * C4Q Access code 2.1 HW for 3-20 2015
 * Program prompts the user to input a certain place
 * of the fibonacci sequence and outputs that place to the user.
 *
 */
public class Fibonacci {

    public static long Fibonacci(long N) {
        //N is user input.
        //I is beginning number.
        //J is second number.
        long I = 0;
        long J = 1;
        long Sum=0;

        for (long i = 1; i < N; i++) {

            if (N < 1) {
                System.out.println("Invalid Input");

            } else

                 Sum =  (I + J);
                   I = J;
                   J = Sum;


        } return Sum;


    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to Fibonacci's place!");
         while (true) {
             System.out.print("Type in which integer in the sequence  \n" +
                     "you'd like to see.");
             long N = input.nextInt();
             System.out.print(Fibonacci(N)+"\n");
         }


    }


}
