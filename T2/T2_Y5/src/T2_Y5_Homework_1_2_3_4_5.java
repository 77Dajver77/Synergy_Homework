import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// 1.Пользователь вводит 10 чисел, сохраните их в массив.
// 2.Сохраните 10 чисел в массив, выведите их с конца
// 3.Сохраните 10 строк в массив, выведите с конца каждую вторую
// 4.В файле 10 дробных чисел. Считайте в массив, выведите те, что больше числа пи.
// 5.Пользователь вводит буквы. Пока не введёт букву ‘ю’, сохраняйте буквы в
//   массив char(пусть в нем будет 100 элементов максимум). Потом создайте
//   новый массив char размером столько, сколько букв ввел пользователь. Скопируйте в него буквы из первого массива.
public class T2_Y5_Homework_1_2_3_4_5 {
    public static void main(String[] args) throws IOException {
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int x = 0; x < 10; x++) {
            System.out.println("Введите число:");
            array[x] = scanner.nextInt();                               // Сохроняем числа в массив
        }

        for (int x = 9; x >= 0; x--) {                                   // Вывод массива с конца
            System.out.println(array[x]);
        }

        String str[] = new String[10];
        for (int x = 0; x < 10; x++) {
            System.out.println("Введите строку: ");
            str[x] = scanner.nextLine();                                 // Сохраняем строки в массив
        }
        for (int x = 9; x >= 0; x = x - 2) {
            System.out.println(str[x]);                                 // Вывод строк из массива с конца каждой второй
        }

        InputStream stream = new FileInputStream("F:\\Java\\T2_Y5_Homework\\src\\number");  // Считать из файла
        Scanner scannerNumber = new Scanner(stream);
        double number[] = new double[10];
        System.out.println("Числа из файла больше числа PI");
        for (int x = 0; x < 10; x++) {
            number[x] = scannerNumber.nextDouble();
            if (number[x] > Math.PI) {
                System.out.println(number[x]);
            }
        }

        int i = 0;
        char charFirst[] = new char[100];
        InputStreamReader scannerChar = new InputStreamReader(System.in);
        do {
            System.out.println("Введите букву: ");
            charFirst[i] = (char) scannerChar.read();
        } while ((charFirst[i] != 'ю') && (i < 100));
        int sizeArray = charFirst.length;
        char charSecond[] = new char[sizeArray];
        for (int x = 0; x <= sizeArray; x++) {
            charSecond[x] = charFirst[x];
        }
    }
}
