package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum =0;

        for (int i = 0; i  <= n; i++){

            sum =sum + i;
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        int product =1;

        for (int i = 1; i  <= n; i++){

            product  = product * i;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        int reverse = 0;
        /**
         * String number =val.String();
         * String reversed =BasicUtilities
         */

                 while(val !=  0)
                  {
                      reverse = reverse * 10 + val % 10;
                      val = val / 10;
                  }
                  return reverse;
              }
    }

