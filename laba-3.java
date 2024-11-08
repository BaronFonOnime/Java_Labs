import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Введите количество строк в массиве: ");
            int rows = scanner.nextInt();

            if (rows == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            System.out.print("Введите количество столбцов в массиве: ");
            int cols = scanner.nextInt();

            int[][] array = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = random.nextInt(101);
                }
            }

            System.out.print("Введите число для поиска: ");
            int targetNumber = scanner.nextInt();

            int count = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (array[i][j] == targetNumber && (i % 2 != 0) && (j % 2 != 0)) {
                        count++;

                        // Выводим модуль разности индексов
                        int indexDifference = Math.abs(i - j);
                        System.out.println("Найден элемент " + targetNumber + " на позиции (" + i + ", " + j + "). Модуль разности индексов: " + indexDifference);
                    }
                }
            }

            System.out.println("Количество элементов, удовлетворяющих условию: " + count);
        }
    }
}
