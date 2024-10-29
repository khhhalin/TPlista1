package com.khhhalin;

public class ASay extends LetterSay {
    public ASay(String message) {
        super(message);
    }

    @Override
    protected void printFigure() {
        System.out.println("   A   ");
        System.out.println("  A A  ");
        System.out.println(" AAAAA ");
        System.out.println("A     A");
    }
}
