import java.util.Scanner;

//1.  Пользователь вводит стихотворение из четырёх строк. Соберите их в одну переменную, между каждой строкой вставьте символ переноса строки: «\n».
//2.  Пользователь вводит три слова, соберите из них строку, где слова будут в обратном порядке.
//3.  Пользователь вводит слово. Добавьте к нему в начало «вы говорите:» ... слово пользователя. И в конец: «.. и что?».
public class T3_Y5_Homework_1_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();
        System.out.println("Введите четвертую строку: ");
        String str4 = scanner.nextLine();
        StringBuilder str = new StringBuilder(str1 +"\n");
        str = str.append(str2+"\n");
        str = str.append(str3+"\n");
        str = str.append(str4+"\n");
        System.out.println(str+"\n");

        System.out.println("Введите первое слово: ");
        String word1 = scanner.next();
        System.out.println("Введите второе слово: ");
        String word2 = scanner.next();
        System.out.println("Введите третье слово: ");
        String word3 = scanner.next();
        StringBuilder word = new StringBuilder(word3 + " " + word2 +" " + word1);
        System.out.println(word);

        System.out.println("Введите слово: ");
        String word4 = scanner.next();
        StringBuilder word5 = new StringBuilder("вы говорите: " + word4 + " и что?");
        System.out.println(word5);
       // word.append("вы говорите: " + word4 + " и что?")

    }
}
