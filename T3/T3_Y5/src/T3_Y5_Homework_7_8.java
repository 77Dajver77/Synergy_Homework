import java.util.Scanner;

//7.  Пользователь вводит предложение, удалите все пробелы из него.
//8.  Вернитесь к программе, которая запрашивает курс валют. Напишите генератор даты для запроса к апи, на основе даты, введенной пользователем. ИспользуйтеStringBuilder.
public class T3_Y5_Homework_7_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение :");
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder(str);
        for (int x = 0; x < str.length()-1; x++){
            if (builder.charAt(x) == ' '){
                builder.deleteCharAt(x);
            }
        }
        System.out.println(builder);



    }

}
