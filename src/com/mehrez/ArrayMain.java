package com.mehrez;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMain {

    public static void main(String[] args) {
        int[] ids = new int[3];
        System.out.println(ids);     //the returned value is the reference of the array in memory: [I@21dcbe09
        System.out.println(ids[0]);  //the returned value is 0 Since an int is a primitive data type in Java ,
                                    // all int elements have to be initialized to something. They can't be null. Java chose 0 as the default value,

        String[] strings = new String[3];
        System.out.println(strings);    //the returned value is the reference of the array in memory: [Ljava.lang.String;@c970adb2
        System.out.println(strings[0]); //the returned value is null java initializes Object array's elements to null, if it is not initialized

        //arrays can be declared in a variety of ways. Here are some examples.
        // You can generally put the square brackets anywhere you want to near the variable name.
        int[] ids1;
        int [] ids2 = new int[] {5};
        int ids3[] = new  int[] {1,2};
        int ids4 [];

        //You can also declare an array with multiple variable names like this.
        // Just be careful where you declare the square brackets if you're going to do this.
        // You should do it at the beginning; otherwise, you might end up with an array and a couple of ints

        int[] ids5, ids6, ids7;

        String[] instruments = new String[] {"guitar","drum", "piano"};
        Arrays.sort(instruments, Comparator.reverseOrder());
        System.out.println(Arrays.toString(instruments));

        int[] fibArray = new int[]{5,2,1,3,8,1,10};
        Arrays.sort(fibArray);  //[piano, guitar, drum]
        System.out.println(Arrays.binarySearch(fibArray, 3)); //3

        String[] instruments1 = new String[] {"guitar","drum","piano"};
        String[] instruments2 = new String[] {"guitar","drum","violin", "piano"};
        System.out.println(Arrays.mismatch(instruments1, instruments2)); //2
        System.out.println(Arrays.compare(instruments1, instruments2)); //-6

        System.out.println(Arrays.equals(ids2, ids3)); //false
        System.out.println(ids2.equals(ids3)); //false
        System.out.println(Arrays.compare(ids2, ids3)); //1

        String[][] multiDimensionArray = new String[][] {
                {"a", "aa", "aaa"},
                {"b", "bb"},
                {"c", "cc", "ccc", "cccc"}
        };

        System.out.println(Arrays.toString(multiDimensionArray));  //[[Ljava.lang.String;@c0f20577  //Arrays.toString does not support multi arrays

        for (String[] row: multiDimensionArray) {
            for (String col: row) {
                System.out.println(col);
            }
        }
    }
}
