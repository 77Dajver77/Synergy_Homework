/* 1. Где хранятся переменные?    В оперативной памяти в ячейках (регистрах).
      Сколько переменныч можно задать в программе?    Бесконечное множество (теоретически, практически ограничение накладывает размер памяти).
      Чем ограничен размер?  Объемом оперативной памяти. */
// 2. Пользователь вводит строку, выведите ее длину.
// 3. Пользователь вводит две строки, выведите сумму их длин.
// 4. Пользователь вводит три строки. Найти, какая из них короче всех.

import java.util.Scanner;


public class T1_Y3_Homework_1_2_3_4 {
    public static void main(String[] args) {
        Scanner firstLine = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String line_1 = firstLine.nextLine();
        System.out.println("Длина первой строки = " + line_1.length()); // Вывод длины строки

        Scanner secondLine = new Scanner(System.in);
        System.out.println("Введите вторую строку");
        String line_2 = secondLine.nextLine();
        System.out.println("Длина двух строк = " + (line_1.length() + line_2.length())); // Вывод суммы длин двух строк

        Scanner thirdLine = new Scanner(System.in);
        System.out.println("Введите третью строку");
        String line_3 = thirdLine.nextLine();
        if (line_1.length() < line_2.length()) {   // Поиск самой короткой строки из трёх (алгоритм не полный, нет проверки на равенство строк)
            if (line_1.length() < line_3.length()) {
                System.out.println("Первая строка короче всех");
            }
            else {
                System.out.println("Третья строка короче всех");
            }
        }
        else {
            if (line_2.length() < line_3.length()) {
                System.out.println("Вторая строка короче всех");
            }
            else {
                System.out.println("Третья строка короче всех");
            }
        }


    }
}