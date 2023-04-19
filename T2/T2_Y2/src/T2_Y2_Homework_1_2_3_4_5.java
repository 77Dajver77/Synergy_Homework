// 1. Выведите числа от 0 до миллиона
// 2. Выведите числа от 1.5 до 101.5: 1.5,2,2.5,3,3.5...101.5
// 3. Выведите латинский алфавит от a до z
// 4. Выведите русский алфавит от а до я
// 5. Создайте 10 тысяч файлов

import java.io.File;
import java.io.IOException;

public class T2_Y2_Homework_1_2_3_4_5 {
    public static void main(String[] args) throws IOException {
        int x = 0;
        while (x<=100000){
            System.out.println(x++);                              // Вывод чисел от 0 до миллиона
        }
        double y = 1.5;
        while (y <= 101.5) {
            System.out.println(y);                              // Вывод чисел от 1.5 до 101.5: 1.5,2,2.5,3,3.5...101.5
            y = y + 0.5;
        }
        x = 97;
        char letter;
        while (x <= 122){
            System.out.println(letter = (char)x);                // Вывод латинского алфавита от a до z
            x++;
        }
        x = 1072;
        while (x <= 1103){
            System.out.println(letter = (char)x);                // Вывод русского алфавита от а до я
            x++;
        }
        x = 1;
        while (x <= 10000 ) {
            File file = new File("files/" + x++);        // Создаем 10000 файлов
            file.createNewFile();
        }


    }
}
