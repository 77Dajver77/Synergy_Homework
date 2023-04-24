//1.  Выведите таблицу умножения 1 - 9.
//2.  Выведите таблицу умножения 1 - 20.
//9.  Предыдущее задание, но с русским алфавитом.

public class T3_Y9_Homework_1_2 {
    public static void main(String[] args) {
        System.out.println("      1     2     3     4     5     6     7     8     9");
        System.out.println();
        int[][] table = new int[10][10];
        for (int i = 1; i < table.length; i++) {
            System.out.print(i + "     ");
            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = i * j;
                System.out.print(table[i][j] + "     ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] table1 = new int[21][21];
        System.out.println("      1     2     3     4     5     6     7     8     9     10     11     12     13    14     15     16     17     18     19     20");
        System.out.println();
        for (int i = 1; i < table1.length; i++) {
            System.out.print(i + "     ");
            for (int j = 1; j < table1[i].length; j++) {
                table1[i][j] = i * j;
                System.out.print(table1[i][j] + "     ");
            }
            System.out.println();
        }


    }




}
