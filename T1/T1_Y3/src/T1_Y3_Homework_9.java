import java.util.Scanner;

// 9. Пользователь вводит строку. Используя substring, вывести первые 5 символов.
public class T1_Y3_Homework_9 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.print("Введите строку не менее 5 символов ");
        String str = line.nextLine();
        while (str.length() < 5 ){
            System.out.print("Введите строку не менее 5 символов ");
            str = line.nextLine();
        }
        System.out.println(str.substring(0,5));

    }
}
