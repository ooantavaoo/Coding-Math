
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
        int i2 = 0;
        int index = 0;
        int[] array2 = new int[array1_length - 1];

        while (i < array1_length) {
            if (array1[index] < array1[i]) {
                array2[i2] = array1[i];
                i++;
                i2 ++;

            } else {
                index = i;
            }

            System.out.println(Arrays.toString(array2));
        }

    }
}
