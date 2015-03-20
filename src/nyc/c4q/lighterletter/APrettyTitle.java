package nyc.c4q.lighterletter;

import java.text.AttributedCharacterIterator;
import java.util.Scanner;

/**
 * Created by John Gomez on 3/18/15.
 * C4Q Access code 2.1 HW for 3-20 2015
 * Program prompts the user to input a phrase and a character
 * and outputs a stylized rendition of it as if it were a title.
 * //code was built using code from Stackoverflow and collaborators from within.
 */
public class APrettyTitle {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type out your title.");

        String input = userInput.nextLine();

        System.out.println(printTitle(input));
        printUnderline(printTitle(input), '*');


    }

    public static String printTitle(String s) {
        //check if the string is empty, if it is, return it immediately
        if (s.isEmpty()) {
            return s;
        }

        //split string on space and create array of words
        String[] arr = s.split(" ");
        //create a string buffer to hold the new capitalized string
        StringBuffer sb = new StringBuffer();

        //check if the array is empty (would be caused by the passage of s as an empty string [i.g "" or " "],
        //if it is, return the original string immediately
        if (arr.length < 1) {
            return s;
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void printUnderline(String s, char c) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == ' ')
                System.out.print(' ');
            else
                System.out.print(c);
    }


}



