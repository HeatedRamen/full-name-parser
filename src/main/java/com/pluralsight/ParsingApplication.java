package com.pluralsight;

import java.util.Scanner;

public class ParsingApplication {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompt user for name and trim off any leading whitespaces
        println("Please enter your full name");
        String userName = input.nextLine();
        userName = userName.trim();

        // Parse full name into an array
        String[] nameParsed = userName.split("\\s+");

        // Output first name
        println("First name: " + nameParsed[0]);

        // If no middle name then state, else default into printing everything
        if (nameParsed.length == 2){
            println("Middle name: (none)");
            println("Last name: " + nameParsed[1]);
        } else {
            println("Middle name: " + nameParsed[1]);
            println("Last name: " + nameParsed[2]);
        }

        // Assumptions are that user will always enter either First Middle Last or First Last
        // and
        // All names are only one word, two-word last names are kinda uhm cooked
    }
    static void println(String message){System.out.println(message);}
}
