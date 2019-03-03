package com.zipcodewilmington.assessment1.part2;
import java.lang.*;
import java.lang.Integer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;

//for(Object x :objectArray)

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }


    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        // Container

        Integer[] container = new Integer[objectArray.length]; // {null,null,...,null}
        Integer counter = 0;

        for (int i = 0; i < objectArray.length; i++) {

            if (objectArray[i] != objectToRemove) {
                container[counter] = (Integer) objectArray[i];
                counter++;
            }
            // System.out.println( i + " " +(Integer) objectArray[i] + " " + Arrays.asList(container) );
        }

        container = Arrays.copyOf(container, counter);

        //System.out.println( Arrays.asList(container) );

        return container;

//        public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {

        //int j = 0;
        /* ArrayList<Integer>   newArray = new ArrayList<Integer>(objectArray.length);


        for (int i = 0; i < objectArray.length; i++) {

            if (objectArray[i] != objectToRemove) {
               newArray.add(objectArray[i]);
            }

        }
        return  newArray.toArray(new Integer[newArray.size()]);*/
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        int count = 1, tempCount;

        int popular = (int) objectArray[0];
        //int temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            int temp = (int) objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (temp == (int) objectArray[j]) {
                    tempCount++;
                }
                if (tempCount > count) {
                    popular = temp;
                    count = tempCount;
                }
            }
        }

        return popular;

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        int count = 1;
        int tempCount, j;
        int nonpopular = (int) objectArray[0];
        //int temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            int temp = (int) objectArray[i];
            tempCount = 0;
            for (j = 1; j < objectArray.length; j++) {
                if (temp <= (int) objectArray[j]) {
                    tempCount++;
                }
                if (tempCount < count) {
                    nonpopular = temp;
                    count = tempCount;
                }
            }

        }
        return nonpopular;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Integer[] newArray = new Integer[(objectArray.length) + (objectArrayToAdd.length)];
        int count = 0;
       // System.out.println(newArray.length);


        for (int i = 0; i < (Integer) objectArray.length; i++) {

            newArray[count] = (Integer) objectArray[i];
            count++;
        }
       // System.out.println(count);
        for (int j = 0; j < (Integer) objectArrayToAdd.length; j++) {

            newArray[count] = (Integer) objectArrayToAdd[j];
            count++;

        }
     //   System.out.println(count);

//        System.out.println((Integer) newArray[count] + "" + Arrays.asList(newArray));

       // System.out.println( "This is the END!!! ");

        return newArray;
    }
}





