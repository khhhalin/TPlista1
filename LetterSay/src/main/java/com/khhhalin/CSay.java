package com.khhhalin;

public class CSay extends LetterSay {
    public CSay(String message) {
        super(message);
    }

    @Override
    protected void printFigure() {
        System.out.println(" CCCCCC");
        System.out.println("CC     ");
        System.out.println("CC     ");
        System.out.println(" CCCCCC");
    }
}