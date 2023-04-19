import java.util.Scanner;

// 3. Найдите первую гласную букву в слове.
// 4. Посчитайте количество согласных букв в слове.
// 5. Выведите слово наоборот, при этом столбиком.
// 6. Замените все гласные в слове на ‘у'.
public class T2_Y7_Homework_3_4_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.next();
        boolean flag = true;
        int x = 0, i = 0, vowel = 0;
        char[] charVowel = new char[]{'а', 'у', 'е', 'о', 'э', 'я', 'и', 'ю'};
        do {

            do {
                flag = (word.charAt(x) == charVowel[i]) ? true : false;
                i++;
            } while (!flag && i < 8);

            x++;
            i = 0;
        } while (!flag && x < word.length());
        System.out.println("Первая гласная буква в слове: " + word + " " + word.charAt(x - 1));

        x = 0;
        i = 0;
        do {
            do {
                if (word.charAt(x) == charVowel[i]) {
                    vowel = vowel + 1;
                }
                i++;
            } while (i < 8);
            x++;
            i = 0;
        } while (x < word.length());
        System.out.println("Количество согласных букв в слове: " + word + " " + (word.length() - vowel));    // Вывод количества согласных букв в слове

        for (int y = word.length() - 1; y >= 0; y--) {
            System.out.println(word.charAt(y));                                                              // Вывод слова наоборот столбиком
        }

        x = 0;
        i = 0;
        char[] wordChart = word.toCharArray();

        do {
            do {
                if (wordChart[x] == charVowel[i]) {
                    wordChart[x]= 'у';
                }
                i++;
            } while (i < 8);
            x++;
            i = 0;
        } while (x < word.length());
        String strWord = new String(wordChart);
        System.out.println(strWord);                                               // Вывод слова с замененными гласными на у
    }
}
