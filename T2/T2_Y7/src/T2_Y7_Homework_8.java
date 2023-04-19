import java.util.Scanner;

// 8. Пользователь вводит предложение. Замените в каждом слове этого предложения, последн** д** бук** на **.
public class T2_Y7_Homework_8 {
    public static void main(String[] args) {
        System.out.println("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] word = str.toCharArray();
        int x = 0;
        do  {
            if (word[x] == (' ') || word[x] == ('.') || word[x] == (',') || word[x] == ('!') || word[x] == ('?')) {         // Перечисление знаков припенания, можно добавить еще.
                word[x - 2] = word[x - 1] = '*';
                x++;
            }
            x++;
        } while (x < str.length());
        String strFinal = new String(word);
        System.out.println(strFinal);

    }
}
