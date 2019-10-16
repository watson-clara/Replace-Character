import java.util.*;
// this is the main class
public class StringManipulator {
    /*
        what goes into main method may include:
        (1) logics that deal with user interaction
        (2) utlization of the required methods
        (3) error checking of user input
    */
    public static void main(String[] args) {
        System.out.println();
    }

    // this method checks if any given input string is empty
    // if empty, alert users who goes wrong and return false
    // otherwise return true
    /* e.g.1, str: godawgo
             char: ""
             print: Error - There is no input
             return: false
       e.g.2, str: ""
             char: s
             print: Error - There is no input
             return: false
    */
    public static boolean validateString(String str) {
        // you will remove this line
        return true;
    }

    // this method checks if the given character c is contained by the string str
    // if c is not contained by str, alert users what goes wrong and return false
    // otherwise return true
    /* e.g.1, str: godawgo
             char: o
             return: true
       e.g.2, str: godawgo
             char: s
             print: Error - The string does not contain the given character
             return: false
    */
    public static boolean validateStringContainsChar(String str, char c) {
        // you will remove this line
        return true;
    }

    // this method takes a string and print it reversely
    public static void printReverse(String str) {
        // you will remove this line
        System.out.println();
    }

    // this method replace oldChar with newChar for any occurance of oldChar
    // you should assume the validity of all parameters
    /* e.g.1, str: godawgo
             oldChar: o
             newChar: t
             return: gtdawgt
    */
    public static String replaceAll(String str, char oldChar, char newChar) {
        // you will remove this line
        return "";
    }

    // this method checks whether the give occurance of c in str is valid
    // you should assume that c is contained by str - this can be guaranteed by validateChar
    // if c does not have an number (e.g., 3rd) of occurance, return -1
    // otherwise, return the index of c at the number (e.g., 3rd) of occurance
    /* e.g.1, str: godawgo
             char: o
             number: 2
             return: 6
       e.g.2, str: godawgo
             char: o
             number: 3
             return: -1
    */
    public static int validateOccurance(String str, char c, int number) {
        // you will remove this line       
        return -2;
    }

    // this method replace the character at index i with newChar
    // this method may take advantage of the validateOccurance method 
    // all parameters should be assumed valid
    /* e.g.1, str: godawgo
             i: 2
             newChar: s
             return: gosawgo
    */
    public static String replaceSingle(String str, int i, char newChar) {
        // you will remove this line
        return "";
    }

    // this method removes character c at any occurance
    // all parameters should be assumed valid
    /* e.g.1, str: godawgo
             char: o
             return: gdawg
    */
    public static String remove(String str, char c) {
        // you will remove this line
        return "";
    }

    /*
        You are welcome to add more methods below
    */

}
