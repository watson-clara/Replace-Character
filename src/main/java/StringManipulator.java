import java.util.*;
import java.util.Scanner;

// this is the main class
public class StringManipulator {
    static String stringInput;
    static String stringManipulation;
    static Boolean problemNone = false;
    static char newChar;
    static char oldChar;
       /*
        what goes into main method may include:
        (1) logics that deal with user interaction
        (2) utlization of the required methods
        (3) error checking of user input
    */
    public static void main(String[] args) {
        //this creatss aninstantce of the scanner class that will allow the console to take InputS
        Scanner input = new Scanner(System.in);	
    
        
        
        while (problemNone == false){
            System.out.println("------------------------------------------");
            System.out.println("Enter the string to be manipulated");
            stringInput = input.nextLine();
            
            validateString(stringInput);
        }
        System.out.println("Enter your command (quit, print reverse, replace all, replace single, remove)");
            stringManipulation = input.nextLine();
            problemNone = false;
            if (stringManipulation.equals("print reverse")){
                printReverse(stringInput);
            } else if (stringManipulation.equals("replace all")){
                while (problemNone == false){
                    oldChar = enterCharacter();
                    validateStringContainsChar(stringInput,oldChar);
                }
                newChar = newCharacter();
                System.out.println(replaceAll(stringInput,oldChar,newChar));
            }else if (stringManipulation.equals("replace single")){
                while (problemNone == false){
                    oldChar = enterCharacter();
                    validateStringContainsChar(stringInput,oldChar);
                }
                newChar = newCharacter();
                problemNone = false;
                while (problemNone == false){
                    int numChar = charOccurance(oldChar);
                    validateOccurance(stringInput,oldChar,numChar);
                }
                System.out.println(replaceSingle(stringInput,oldChar,newChar));
            }else if (stringManipulation.equals("remove")){
                while (problemNone == false){
                    oldChar = enterCharacter();
                    validateStringContainsChar(stringInput,oldChar);
                }
                System.out.println(remove(stringInput,oldChar));
                
            }else if (stringManipulation.equals("quit")) {
            }else {
            }
           
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
        boolean isEmpty = str == null || str.trim().length() == 0 ;
        if (isEmpty == true){
            System.out.println("** ERROR - there is no input **\n");
            problemNone = false; 
        }else {
            problemNone = true;
        }
       return false;
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
        if (str.indexOf(c) >= 0) {
            problemNone = true;
        }else {
            System.out.println("** ERROR - The string does not contain the given character try again**");
            problemNone = false; 
        }
        return true;
    }

    // this method takes a string and print it reversely
    public static void printReverse(String input) {
        String output = new String();
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        System.out.println(output);     
    }
    // this method replace oldChar with newChar for any occurance of oldChar
    // you should assume the validity of all parameters
    /* e.g.1, str: godawgo
             oldChar: o
             newChar: t
             return: gtdawgt
    */
    public static String replaceAll(String str, char oldChar, char newChar) {
        String old =String.valueOf(oldChar);
        String neww =String.valueOf(newChar);
        str = str.replace(old,neww);
        return str;
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
       Scanner input = new Scanner(System.in);	
    int length = str.length();
    int nums[] = new int[number];
    int count = 0;
    for(int i=0; i < length; i++){ 
        if(str.charAt(i) == c) {
        nums[count] = i;
        
        count++;
        }
    }
            System.out.println(Arrays.toString(nums) + count);
    if(nums[number-1] == 0){
        System.out.print("** ERROR - The string does not contain that many " + c + "'s try again**");
        boolean problemNone = false;
    }else {		
     boolean problemNone = true;
    }
    return nums[number-1];
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
        String s =String.valueOf(c);
        str = str.substring(0,i)+newChar+str.substring(i);
        return str;

    }

    // this method removes character c at any occurance
    // all parameters should be assumed valid
    /* e.g.1, str: godawgo
             char: o
             return: gdawg
    */
    public static String remove(String str, char c) {
        String s =String.valueOf(c);
        str = str.replace(s, "");
        return str;
        }
    
        

    /*
        You are welcome to add more methods below
    */
    public static char enterCharacter() {
        Scanner input = new Scanner(System.in);	
        System.out.println("Enter the character to replace");
        char newChar = input.next(".").charAt(0);
        problemNone = false;
        return newChar;
    }
    public static char newCharacter() {
        Scanner input = new Scanner(System.in);	
        System.out.println("Enter the new character");
        char newChar = input.next(".").charAt(0);
        problemNone = false;
        return newChar;
    }
     public static int charOccurance(char c) {
        Scanner input = new Scanner(System.in);	
        System.out.print("which " + c + " would you like to replace");
        int numChar = input.nextInt(); 
        return numChar;
    }
    
}
