
import java.util.Random;
import java.util.Scanner;
// задание номер 1 вар 10 (задание с массивом)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            
            System.out.print("Введите количество строк в массиве  ");
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
                    if (array[i][j] == targetNumber && ((i % 2 != 0) && (j % 2 != 0))) {
                        count++;
                    }
                }
            }

            
            System.out.println("Количество элементов, удовлетворяющих условию: " + count);
        }
    }
}
