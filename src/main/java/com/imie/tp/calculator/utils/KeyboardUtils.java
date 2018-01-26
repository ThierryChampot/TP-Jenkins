package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 * The keyboard listener.
 * @author Thierry
 *
 */
final class KeyboardUtils {

    /**
     * Instantiated once as a singleton
     */
    private static Scanner keyboard;

    /**
     * Creates the keyboard listener.
     * Displays a questions and reads what is answered.
     * @param displayAsk The answer passed.
     * @return Next question.
     */
    public static String readFromKeyboard(final String displayAsk) {
        keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        return keyboard.nextLine();

    }

    /**
     * The listener can be closed.
     */
    public static void closeKeyboard() {
        keyboard.close();
    }
}
