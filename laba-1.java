import java.util.Scanner;

public class FunctionCalculator {
    public static double calculateY(double x) {
      

        double innerPart = Math.asin(Math.pow(x, 8) / (Math.pow(x, 8) + 3))
                + Math.log(2 * Math.pow(2, Math.cos(Math.sqrt(Math.abs(x + 1))))
                + Math.pow(Math.abs(x + 1), 5 * Math.sin(3 * x + 1)));

        return Math.cbrt(Math.abs(innerPart));
    }

    public static boolean isPointInSquare(double x, double y) {
        return Math.abs(x) <= 4 && Math.abs(y) <= 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double y = calculateY(x);
        System.out.printf("Значение функции y(%f) = %f\n", x, y);

        boolean isInside = isPointInSquare(x, y);
        System.out.printf("Точка (%f, %f) принадлежит области D: %b\n", x, y, isInside);
    }
}