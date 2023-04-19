// Задать строковую переменную. Заменить в ней все буквы о на «обро».
// Задать строковую переменную. Вывести ее в верхнем регистре.
// Задать строковую переменную. Заменить в ней буквы а на @, а буквы о на 0.

public class T1_Y2_Homework_12_13_14 {
    public static void main(String[] args) {

        String line = "Задать строковую переменную";
        String line2 = line.replace("о", "обро");
        System.out.println(line2);
        String line3 = line.toUpperCase();
        System.out.println(line3);
        String line4 = line.replace("а", "@");
        String line5 = line4.replace("о", "0");
        System.out.println(line5);
    }
}