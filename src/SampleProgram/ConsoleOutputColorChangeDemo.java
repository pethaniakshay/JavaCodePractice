/*
 This program is a demo for changing the color of output text on Stadard output console.
 */
package SampleProgram;

/**
 *
 * @author Akshay
 */
public class ConsoleOutputColorChangeDemo {
    
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println(RED + "I am really something. No No I am Everything." + RESET);
        System.out.println(BLACK + "I am really something. No No I am Everything." + RESET);
        System.out.println(GREEN + "I am really something. No No I am Everything." + RESET);
        
        
    }    
}
