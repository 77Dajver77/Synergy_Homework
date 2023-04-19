import java.util.Scanner;

// 7. Пользователь вводит дробное число, выведите его дробную часть.
public class T2_Y7_Homework_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String number = scanner.next();
        int x = 0, index = 0;
        do {
            if (number.charAt(x) == '.') {
                index = x +1;
            }
            x++;
        }while (x < number.length() && index ==0);
        System.out.println(number.substring(index,number.length()));  // Выводим дробную часть числа
    }

}
