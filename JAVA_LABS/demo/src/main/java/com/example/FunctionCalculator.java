import java.util.Scanner;

// лаба номер 1 

public class FunctionCalculator {
    
    public static double calculateYWithMath(double x) {
        // Использование стандартных математических функций
        return Math.asin(Math.pow(x, 3) / (x * x + 3)) +
               (Math.log(Math.pow(Math.cos(Math.pow(x, 2) - 1), x)) / Math.log(2)) +
               x + 1 + Math.pow(3 * Math.sin(x + 1), 1.0 / 5);
    }

    public static double calculateYWithFormulas(double x) {
        // Реализация с использованием формул преобразования
        double term1 = Math.sin(x); // Первый член
        double term2 = Math.cos(x); // Второй член
        double cubicTerm = Math.pow(x, 3) / 2; // Доля от x в третьей степени
        return term1 + term2 + cubicTerm + 1; // Суммируем все члены
    }

    public static boolean isPointInArea(double x, double y) {
        // Проверка принадлежности точки области D (например, квадрат со стороной 8)
        return Math.abs(x) <= 4 && Math.abs(y) <= 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        // Вычисление значения функции двумя способами
        double yWithMath = calculateYWithMath(x);
        double yWithFormulas = calculateYWithFormulas(x);

        // Проверка принадлежности точки области
        boolean isInAreaWithMath = isPointInArea(x, yWithMath);
        boolean isInAreaWithFormulas = isPointInArea(x, yWithFormulas);

        // Форматированный вывод результатов
        System.out.printf("Значение функции y(%f) с использованием Math: %f%n", x, yWithMath);
        System.out.printf("Точка (%f, %f) принадлежит области с использованием Math: %b%n", x, yWithMath, isInAreaWithMath);
        
        System.out.printf("Значение функции y(%f) с использованием формул преобразования: %f%n", x, yWithFormulas);
        System.out.printf("Точка (%f, %f) принадлежит области с использованием формул преобразования: %b%n", x, yWithFormulas, isInAreaWithFormulas);
        
        scanner.close(); // Закрываем сканер
    }
}
