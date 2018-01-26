package com.imie.tp.calculator;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * Main application entry point.
 * @author Thierry
 *
 */
public final class Application {

    /**
     * This application shall not be instanciated more than once.
     */
    private Application() { }

    /**
     * @param args Arguments passed by the command line.
     * @author Thierry
     */
    public static void main(final String[] args) {

        // Process...
        // Display & Ask "Type of Operation ":
        //               - 1 : Addition
        //               - 2 : Subtraction
        //               - 3 : Diviside
        //               - 4 : Multiplication
        //               - 5 : Display History
        //               - 9 : Quit
        // TODO : array + foreach
        KeyboardUtils prompt = new KeyboardUtils();
        prompt.readFromKeyboard("Type of Operation ?");

        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Diviside");
        System.out.println("4 : Multiplication");
        System.out.println("5 : Display History");
        System.out.println("9 : Quit");

        // If enter 1
        // Display & Ask "Enter Value a : "
        // Display & Ask "Enter Value b : "
        // after
        // Display : result

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6

        // If enter 9 => Quit application

        //TODO
    }

}
