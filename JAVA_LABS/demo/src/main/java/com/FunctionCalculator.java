import java.util.Scanner;

// лаба номер 2 
public class FunctionCalculator {
    public static double calculateY(double x) {
        if (x <= -4) {
            return Math.cos(x - 1);
        } else if (x >= 4) {
            return Math.sqrt(Math.log(Math.pow(x, 5) - Math.pow(x, 3) + Math.pow(10,x)) / Math.log(2));
        } else {
            return Math.acos(Math.pow(x, 6) / (1 + Math.pow(x, 6)));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = 0;
        try {
            x = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка: введите числовое значение.");
            scanner.next(); // Очищает некорректный ввод
            return;
        }

        double y = calculateY(x);
        System.out.printf("Значение функции y(%f) = %f%n", x, y);
        
        scanner.close();
    }
}

