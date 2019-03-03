package com.zipcodewilmington.assessment1.part2;
import java.lang.String;



import java.lang.reflect.Array;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {


        String[] words = sentence.split(" ");
        //for (String word : words) {
        // System.out.println(word);
        //}
        return words;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        String[] word = sentence.split(" ");

        return word[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        String[] word = sentence.split(" ");

        String reverse = new StringBuffer(word[0]).reverse().toString();
        return reverse;

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String[] word = sentence.split(" ");

        String reverse = new StringBuffer(word[0]).reverse().toString();

        //return (reverse);

        String a = reverse.substring(0, 1).toUpperCase() + reverse.substring(1);


        return a;
    }


    /**
     * @param str   string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {


        StringBuilder str1 = new StringBuilder(str);


        str1.deleteCharAt(index);

       // System.out.println(str1.toString());


        return (str1.toString());
    }
}


