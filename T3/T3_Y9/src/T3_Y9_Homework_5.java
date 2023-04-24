//5.  Создайте двумерный массив. Выведите его первый столбец.
public class T3_Y9_Homework_5 {
    public static void main(String[] args) {
        int[][] table = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i][0] + "     ");
        }

    }
}
