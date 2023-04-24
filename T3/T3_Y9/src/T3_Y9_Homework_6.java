//6.  Создайте матрицу(двумерный массив) int[][], заполните ее таблицей умножения 1 - 9. Выведите ее.
public class T3_Y9_Homework_6 {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        System.out.println("      1     2     3     4     5     6     7     8     9");
        System.out.println();
            for (int i = 1; i < table.length; i++) {
            System.out.print(i + "     ");
            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = i * j;
                System.out.print(table[i][j] + "     ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
