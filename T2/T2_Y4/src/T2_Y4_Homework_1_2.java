// 1.С помощью цикла do..while, выведите римские цифры.
// 2.С помощью цикла do..while, выведите числа от -0.9 до 0.9.
//
public class T2_Y4_Homework_1_2 {
    public static void main(String[] args) {
        char number;
        int x = 8544;
        do {
            number = (char) x;
            System.out.println(number);                               // Вывод римских цифр
            x++;
        } while (x <= 8555);

        double y = -0.9;
        do {
            System.out.println(y);                                    // Вывод чисел от -0,9 до 0,09
            y = y + 0.1;
        } while (y <= 0.9);
    }
}
