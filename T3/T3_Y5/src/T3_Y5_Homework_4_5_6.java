import java.util.Scanner;

//4.  Пользователь вводит пять слов, соберите из них целую строку, между каждым словом вставьте «, и».
//5.  Пользователь вводит предложение их двух слов (считайте в одну переменную String phrase). Вставьте между этими словами
//    «так сказать» используя StringBuilder.insert. Было: «Учу Java». Станет: «Учу, так сказать, Java».
//6.  Пользователь вводит число, любое. 237, например. Выведите: 237 программистов, окончание должно зависеть от числа. 1 программист, 2 программиста, и так дале.
public class T3_Y5_Homework_4_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String word1 = scanner.next();
        System.out.println("Введите второе слово: ");
        String word2 = scanner.next();
        System.out.println("Введите третье слово: ");
        String word3 = scanner.next();
        System.out.println("Введите четвертое слово: ");
        String word4 = scanner.next();
        System.out.println("Введите пятое слово: ");
        String word5 = scanner.next();
        StringBuilder word = new StringBuilder(word1 + ", и " + word2 + ", и " + word3 + ", и " + word4 + ", и " + word5);
        System.out.println(word);

        System.out.println("Введите предложение из двух слов: ");
        Scanner scanner1 = new Scanner(System.in);
        String phrase = scanner1.nextLine();
        char ch[] = phrase.toCharArray();
        int x = 1;
        while (ch[x] != ' ') {
            x++;
        }
        StringBuilder rezPhrase = new StringBuilder(phrase);
        rezPhrase = rezPhrase.insert( x , ", так сказать, ");
        System.out.println(rezPhrase);


    }
}
