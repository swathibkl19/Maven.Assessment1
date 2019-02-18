package com.zipcodewilmington.assessment1.part1;
import com.sun.xml.internal.ws.util.StringUtils;



/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return StringUtils.capitalize(str);


    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String reverse = new StringBuffer (str) .reverse() .toString();
        String reverse1 = reverse;
        return reverse1;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        //String str1 =StringUtils.capitalize(str);
        String reverse = new StringBuffer (str) .reverse() .toString();
        String result = reverse;

        return StringUtils.capitalize(result);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return  str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

       // invertCasing(str)
        //return BasicStringUtils.invertCasing(str);

  char[] chars = str.toCharArray();
      for (int i = 0; i < chars.length; i++)
      {
          char c = chars[i];
          if (Character.isUpperCase(c))
          {
              chars[i] = Character.toLowerCase(c);
          }
          else if (Character.isLowerCase(c))
          {
              chars[i] = Character.toUpperCase(c);
          }
      }
      return new String(chars);

    }
}
