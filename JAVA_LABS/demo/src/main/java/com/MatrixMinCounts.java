
import java.util.Random;
import java.util.Scanner;
// задание номер 2 вар 10 (задание с матрицей)
public class MatrixMinCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Введите размерность матрицы (n m): ");
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[][] matrix = new int[n][m];

            // Заполнение матрицы случайными числами
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = rand.nextInt(101) - 50;
                }
            } 
            System.out.println("Сгенерированная матрица:");
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
     
            // Подсчет минимального количества повторений в каждой строке
            int[] minCounts = new int[n];
            for (int i = 0; i < n; i++) {
                int[] counts = new int[101]; // Для чисел от -50 до 50
                int minCount = Integer.MAX_VALUE;

                for (int num : matrix[i]) {
                    int index = num + 50;
                    counts[index]++;
                    minCount = Math.min(minCount, counts[index]);
                }
             
                // Обработка случая, когда все элементы различны
                if (minCount == 1) {
                    for (int count : counts) {
                        if (count > 1) {
                            minCount = 2; // Если есть хотя бы одно число, встречающееся более 1 раза
                            break;
                        }
                    }
                }

                minCounts[i] = minCount;
            }

            // Вывод результата
            System.out.println("Вектор минимальных количеств повторений:");
            for (int value : minCounts) {
                System.out.print(value + " ");
            }
            System.out.println();

            System.out.print("Продолжить? (да/нет): ");
            if (!scanner.next().equalsIgnoreCase("да")) {
                break;
            }
        }
    }
}
