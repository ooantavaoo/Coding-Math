import java.math.MathContext;
// import java.lang.reflect.Array;
// import java.text.NumberFormat;
// import java.util.Arrays;
import java.util.Scanner;

public class Quadratic {

    Scanner scanner = new Scanner(System.in);

    public double getA_Value() {
        double a = scanner.nextDouble();
        return a;
    }

    public double getB_Value() {
        double b = scanner.nextDouble();
        return b;
    }

    public double getC_Value() {
        double c = scanner.nextDouble();
        return c;
    }

    static Quadratic quadratic = new Quadratic();
    static double a = quadratic.getA_Value();
    static double b = -1 * quadratic.getB_Value();
    static double c = quadratic.getC_Value();

    static double discriminant = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
    static double q_divedend = 2 * a;

    static public double solution_1 = (b + discriminant) / q_divedend;
    String solution_1String = String.valueOf(solution_1);

    static public double solution_2 = (b - discriminant) / q_divedend;
    String solution_2String = String.valueOf(solution_2);



    public static void main(String[] args) {
        if (discriminant < 0) {
            System.out.println("Your solutions are going to be imaginary");
        } else if (discriminant == 0) {
            double solution = b / q_divedend;
            System.out.println("Your solution is " + solution);
        } else {
            System.out.println("Your solutions are " + solution_1 + " and " +
                    solution_2);
        }

    }
}