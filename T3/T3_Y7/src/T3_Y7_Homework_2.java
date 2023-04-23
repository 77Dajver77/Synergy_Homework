//2.  Реализуйте метод, который из двух массивов строк собирает третий, в котором чередуются элементы первых двух.



import java.util.Scanner;

public class T3_Y7_Homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String firstStr = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String secondStr = scanner.nextLine();
        char[] firstChar = firstStr.toCharArray();
        char[] secondChar = secondStr.toCharArray();
        System.out.println("Сумма двух строк: " + getString(firstChar, secondChar));

    }

    static StringBuilder getString(char[] first, char[] second) {
        StringBuilder builder = new StringBuilder();
        int x = 0;
        int y = 0;
        int xFist = first.length;
        int ySecond = second.length;
        boolean endFist = false;
        boolean endSecond = false;

        while ((!endFist) || (!endSecond)) {
            while ((!endFist) && (first[x] != ' ')) {
                builder.append(first[x]);
                x++;
                if (x == xFist) endFist = true;
            }
            if ((!endFist)||(!endSecond)) builder.append(' ');
            while ((!endSecond) && (second[y] != ' ')) {
                builder.append(second[y]);
                y++;
                if (y == ySecond) endSecond = true;
            }
            if ((!endFist)||(!endSecond)) builder.append(' ');
            x++;
            y++;
        }


        return builder;
    }
}







