import java.util.Scanner;

//1.  В чем разница между throw и throws в Java?  throw – используется для вызова исключения, throws – используется в  методе для предупреждения, о том что метод может выбросить исключение
//2.  Пользователь вводит число. Если произошла ошибка ввода, выведите пользователю сообщение о том, что ввод некорректный.
//3.  Пользователь вводит число. Если произошла ошибка ввода, дайте пользователю ввести еще раз: так пока он не введёт нормально (подсказка: while).

public class T4_Y7_Homework_1_2_3 {
    public static void main(String[] args) throws Exception {
        int number = 0;
        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            throw new Exception("Введено не корректное число");
        }
        System.out.println(number);


        boolean b = false;
        do {
            try {
                b = false;
                System.out.println("введите число");
                Scanner scanner1 = new Scanner(System.in);
                number = scanner1.nextInt();
            } catch (Exception e) {
                System.out.println("Введено не корректное число");
                b = true;
            }


        } while (b);

    }
}
