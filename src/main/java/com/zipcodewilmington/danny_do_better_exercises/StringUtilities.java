package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment.concat(secondSegment);
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
       StringBuilder s = new StringBuilder();
       s.append(firstSegment);
        return s.toString().concat(secondSegment);
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        input.split("");
        StringBuilder s = new StringBuilder();
        s.append(input.charAt(0));
        s.append(input.charAt(1));
        s.append(input.charAt(2));
        return s.toString();
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        input.split("");
        StringBuilder s = new StringBuilder();
        s.append(input.charAt(input.length()-3));
        s.append(input.charAt(input.length()-2));
        s.append(input.charAt(input.length()-1));
        return s.toString();
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        if (inputValue==comparableValue) {
            return true;
        } else{
            return false;
        }
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int n = (inputValue.length() -1)/2;
        return inputValue.charAt(n);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String [] s = spaceDelimitedString.split(" ");
        String sd = s[0];
        return sd;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String [] s = spaceDelimitedString.split(" ");
        String sd = s[1];
        return sd;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        StringBuilder s = new StringBuilder();
        s.append(stringToReverse);
        s.reverse();
        return s.toString();
    }
}
