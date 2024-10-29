package com.khhhalin;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid input. Please provide a letter (A or B) followed by a message.");
            return;
        }

        String firstArg = args[0];
        String message = String.join(" ", java.util.Arrays.copyOfRange(args, 1, args.length));

        LetterSay aSay = new ASay(message);
        LetterSay bSay = new BSay(message);

        if (firstArg.equalsIgnoreCase("A")) {
            aSay.say();
        } else if (firstArg.equalsIgnoreCase("B")) {
            bSay.say();
        } else {
            System.out.println("Invalid letter.");
        }
    }
}
