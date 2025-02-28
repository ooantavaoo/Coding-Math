
//import java.util.*;
//import java.math.MathContext;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;

public class arrayPrac {

    public arrayPrac() {

    }

    public static void main(String[] args) throws Exception {

        final int[] array1 = { 3, 2, 4, 5, 67, 1 };
        int array1_length = Array.getLength(array1);
        int i = 1;
        int index = 0;
        int booleanCount = 0;

        int[] array2 = new int[array1_length];
        while (index < array1_length) {
            if (array1[index] < array1[i] && i < array1_length && index < array1_length) {
                booleanCount++;
                i++;
            } else if (array1[index] > array1[i]) {
                i++;
            } else if ((Integer) array1[index] == (Integer) array1[i]) {
                i++;
            } else if (index == array1_length){
                break;
            }

            else {
                System.out.println(array1_length - booleanCount);
                Array.set(array2, (array1_length - booleanCount), array1[index]);
                index++;
                i++;
                booleanCount = 0;

            }

        }
        System.out.println(Arrays.toString(array2));
    }
}
