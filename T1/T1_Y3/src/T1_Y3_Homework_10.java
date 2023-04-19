import java.util.Scanner;

// 10. Считайте boolean переменную. Если пользователь ввел true, вывести “истина”, иначе ничего не стоит выводить.
public class T1_Y3_Homework_10 {
    public static void main(String[] args) {
        Scanner bool = new Scanner(System.in);
        System.out.println("Введите булеву переменную ");
        boolean x = bool.nextBoolean();
        if (x) {
            System.out.println("Истина");
        }
    }
}
