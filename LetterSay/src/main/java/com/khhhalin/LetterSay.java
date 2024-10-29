package com.khhhalin;

public abstract class LetterSay {
    protected String message;

    public LetterSay(String message) {
        this.message = message;
    }

    public void say() {
        printBubble(message);
        printFigure();
    }

    private void printBubble(String text) {
        int length = text.length();
        System.out.println(" " + "_".repeat(length + 2));
        System.out.println("< " + text + " >");
        System.out.println(" " + "-".repeat(length + 2));
    }

    protected abstract void printFigure();
}
