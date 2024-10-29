package com.khhhalin;

public class BSay extends LetterSay {
    public BSay(String message) {
        super(message);
    }

    @Override
    protected void printFigure() {
        System.out.println("BBBBB ");
        System.out.println("B    B");
        System.out.println("BBBBB ");
        System.out.println("B    B");
        System.out.println("BBBBB ");
    }
}
