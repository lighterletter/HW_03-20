package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 *  John Gomez HW due 3-20
 * Divisor pattern.
 * Program takes user input and creates a grid.
 * If column I is divisible by column J or vice versa the
 * program prints "@ " if not the program prints "  ".
 */

public class DivisorPattern {

    public static void print(String text) {
        System.out.print(text);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type in  grid size");

        int axe = input.nextInt();

        art(axe);


    }
    public static void art(int size){
        for (int i = 1; i <= size; i++ ){

            for(int j = 1; j <= size; j++){

                if (i%j==0 || j%i==0) {
                    print("@ ");
                }else{
                    print("  ");

                }
            }
            print("\n");
        }


    }

}
