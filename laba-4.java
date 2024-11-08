import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MatrixMinCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Введите размерность матрицы (n m): ");
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (n <= 0 || m <= 0) {
                System.out.println("Размерности матрицы должны быть положительными.");
                break;
            }

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = rand.nextInt(101) - 50; // Числа от -50 до 50
                    System.out.print(matrix[i][j] + " "); // Выводим сгенерированную матрицу
                }
                System.out.println();
            }

            int[] minCounts = new int[n];

            for (int i = 0; i < n; i++) {
                Map<Integer, Integer> counts = new HashMap<>();
                for (int j = 0; j < m; j++) {
                    counts.put(matrix[i][j], counts.getOrDefault(matrix[i][j], 0) + 1);
                }

                // Ищем минимальное количество в строке
                int minCount = Integer.MAX_VALUE;
                for (int count : counts.values()) {
                    if (count < minCount) {
                        minCount = count;
                    }
                }
                minCounts[i] = minCount; // Сохраняем минимальное количество для строки
            }

            // Выводим вектор с минимальными количествами для каждой строки
            System.out.println("Вектор с наименьшими quantities одинаковых элементов в строках:");
            for (int i = 0; i < n; i++) {
                System.out.println("Строка " + (i + 1) + ": " + minCounts[i]);
            }

            // Запрос на продолжение или выход
            System.out.println("Хотите продолжить? (да/нет)");
            String response = scanner.next();
            if (response.equalsIgnoreCase("нет")) {
                break;
            }
        }
        scanner.close(); // Закрываем сканер после завершения работы
    }
}
