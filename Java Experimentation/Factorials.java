
//import java.util.*;
// import java.math.MathContext;
// import java.lang.reflect.Array;
// import java.text.NumberFormat;
// import java.util.Arrays;
import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class Factorials {

    public Factorials() {

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int size = num;
        int[] arrayOfValues = new int[size];
        int factorialBase = 0; 
        // Subtracting by num
        int i = 0;
        // Array placeholder counter

        for (num = num; factorialBase < num; factorialBase++) {
            int difference = num - factorialBase;
            // Subtracting multiple times
            arrayOfValues[i] = difference;
            // Putting that value into the array placeholder
            i++;
        }
        i = 1;
        int Factorial = arrayOfValues[0];
        while (i < num) {
            Factorial *= arrayOfValues[i];
            i++;

        }

        System.out.println(Factorial);

    }
}