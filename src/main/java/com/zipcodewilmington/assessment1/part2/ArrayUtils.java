package com.zipcodewilmington.assessment1.part2;
import java.lang.*;
import java.lang.Integer;
import java.util.Arrays;
import  java.lang.String;

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

        //for (int i = 0; i < objectArray.length; i++) {
        //  if (objectArray[i].equals(objectToRemove)) {

        //removeValue(objectArray,objectToRemove);
        //}
        //array = ArrayUtils.removeElement(array, element)
        //}
        return null;
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

        int count = 1 ,i;
        int tempCount ,j;
        int nonpopular = (int) objectArray[0];
        //int temp = 0;
        for ( i = 0; i < (objectArray.length - 1); i++) {
            int temp = (int) objectArray[i];
            tempCount = 0;
            for ( j = 1; j < objectArray.length; j++) {
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
        /*int minCount=4;

        for(int i = 0; i < objectArray.length; i++)
        {
            int count = 0;

           // for(int j = 0; j < objectArray.length; j++)
            //{
             //   if(objectArray[j] == objectArray[i])
               // {
                 //   count++;
                //}
            //}

            if(count < minCount)
            {
                minCount = count;
                //minValue = objectArray[i];
            }
        }*/
       // return minCount;
        //return  null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

       /* int[] c = new int[objectArray.length+objectArrayToAdd.length];
        int count = 0;

        for(int i = 0; i < objectArray.length; i++) {
            c[i] = objectArray[i];
            count++;
        }
        for(int j = 0; j < objectArrayToAdd.length;j++) {
            c[count++] = objectArrayToAdd[j];
        }
        for(int i = 0;i < c.length;i++) System.out.print(c[i]+" ");
    }
}*/


      /*  Object[] c = concatenate(objectArray,objectArrayToAdd);


       // System.out.println("Merged object array : "
               // + Arrays.toString(c));
    }
        return Arrays.toString(c);*/



          /*  int aLen = objectArray.length;
            int bLen = objectArrayToAdd.length;
            int[] result = new int[aLen + bLen];

            System.arraycopy(objectArray, 0, result, 0, aLen);
            System.arraycopy(objectArrayToAdd, 0, result, aLen, bLen);

            System.out.println(Arrays.toString(result));
*/
        return null;
    }
}

