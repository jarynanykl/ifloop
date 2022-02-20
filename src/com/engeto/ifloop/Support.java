package com.engeto.ifloop;

import java.util.Scanner;

public class Support {

    public static Scanner scanner = null;
    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static int INVALID_INPUT = -1;

    public void setINVALID_INPUT(int INVALID_INPUT) {
            this.INVALID_INPUT = INVALID_INPUT;
    }
    public static int safeReadInt() {
        int result = INVALID_INPUT;
        String inputText = getScanner().nextLine();
        try {
            result = Integer.parseInt(inputText);
        } catch (NumberFormatException exception) {
            System.err.println("Zadal jsi text, který nelze převést na celé číslo: "+inputText);
            System.err.println("Zadal jsi text, který nelze převést na celé číslo: "+result);
        }
        return result;
    }
}