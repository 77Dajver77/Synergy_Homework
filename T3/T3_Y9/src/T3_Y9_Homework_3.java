//3.  Создайте двумерный массив, задайте для него значения, выведите его элементы.
public class T3_Y9_Homework_3 {
    public static void main(String[] args) {
        int[][] table = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "     ");
            }
            System.out.println();
        }
    }
}
