import java.util.Scanner;

public class FunctionCalculator {
    public static double calculateY(double x) {
        if (x <= -4) {
            return Math.cos(x - 1);
        } else if (x < 4) {
            double arg = Math.pow(x, 6) / (1 + Math.pow(x, 6));
            if (arg < -1 || arg > 1) {
                throw new IllegalArgumentException("Аргумент для arccos должен быть в диапазоне [-1, 1]");
            }
            return Math.acos(arg);
        } else {
            return Math.sqrt(Math.log(Math.pow(x, 5) - Math.pow(x, 3) + Math.pow(10,x)) / Math.log(2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        while (true) {
            System.out.print("Введите значение x (или введите 'q' для выхода): ");
            String input = scanner.nextLine();
            if ("q".equalsIgnoreCase(input)) {
                break;
            }
            try {
                x = Double.parseDouble(input);
                double y = calculateY(x);
                System.out.printf("Значение функции y(%f) = %f%n", x, y);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите числовое значение.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        scanner.close();
    }
}