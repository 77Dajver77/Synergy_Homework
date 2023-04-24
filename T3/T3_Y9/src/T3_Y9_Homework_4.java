//4.  Создайте двумерный массив. Выведите его предпоследнюю строчку.
public class T3_Y9_Homework_4 {
    public static void main(String[] args) {
        int[][] table = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < table[0].length; i++) {
            System.out.print(table[table.length - 2][i] + "     ");

        }
    }
}

