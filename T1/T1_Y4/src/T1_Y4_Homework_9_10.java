import java.util.Scanner;

// 9. Переведите переменную из char в string
// 10.Переведите переменную из char в int и наоборот
public class T1_Y4_Homework_9_10 {
    public static void main(String[] args) {
        Scanner char_1 = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char ch = char_1.next().charAt(0);
        String str = String.valueOf(ch);                        // Перевод из char в string
        System.out.println("ch: " + ch + " str:" + str);

        int numInt = ch;                                      // Перевод из char в int
        System.out.println("ch: " + ch + " int = " + numInt);

        ch = (char) numInt;                                   // Перевод из int в char
        System.out.println("ch: " + ch + " int = " + numInt);

    }
}
