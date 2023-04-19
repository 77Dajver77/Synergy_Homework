import java.util.Scanner;

// 8. Придумайте способ переводить из String в boolean
public class T1_Y4_Homework_8 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String strTrue = "true" ;
        String strFalse = "false";
        boolean boolean_1 = true;
        System.out.print("Введите строку  true/false: ");
        String str_1 = str.nextLine();
        if (str_1.contentEquals(strFalse)) {
            boolean_1 = false;
            System.out.println("String: " + str_1 + "  boolean: " + boolean_1);
        } else if (str_1.contentEquals(strTrue)) {
            boolean_1 = true;
            System.out.println("String: " + str_1 + "  boolean: " + boolean_1);
        } else {
            System.out.println("Не верный ввод строки");
            }


    }
}