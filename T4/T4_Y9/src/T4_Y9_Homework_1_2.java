//1. Чем отличаются checked и unchecked исключения? checked обязательно надо ловить в коде, а unchecked не надо.
//2. Создайте проверяемое и непроверяемое исключение.
//3. Создайте 10 checked и 10 unchecked исключений. Сделайте два массива с ними.
//4. Сделайте метод, который возвращает из этих массивов случайный элемент; иногда из первого, иногда из второго. Какой тип данных будет возвращать этот метод?
//5. Нарисуйте иерархию классов exception и runtime exception до самого начала

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class T4_Y9_Homework_1_2 {
    public static void checked () {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\T4\\T4_Y9\\src\\T4_Y9_Homework_1_2.java");
            file.createNewFile();
            throw new Exception();
        } catch (Exception e) {

        }
    }

    public static void unchecked ()  throws RuntimeException,IOException{
        File file = new File("C:\\Users\\User\\Desktop\\T4\\T4_Y9\\src\\T4_Y9_Homework_1_2.java");
        file.createNewFile();
        }
    }




