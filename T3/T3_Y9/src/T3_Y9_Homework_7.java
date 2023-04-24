//7.  Создайте матрицу int[][], заполните ее календарем на текущий месяц:
//    пн вт ср чт пт сб вс
//    1   2   3  4   5
//    6   7   8   9 10 11  12
//    Выведите ее.
public class T3_Y9_Homework_7 {
    public static void main(String[] args) {
        int[][] table = {{27,28, 29, 30, 31, 1, 2},{3,4,5,6,7,8,9},{10,11,12,13,14,15,16},{17,18,19,20,21,22,23},{24,25,26,27,28,29,30}};
        System.out.println("пн     вт      ср     чт    пт     сб     вс");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == 1) {
                    System.out.print(table[i][j] + "      ");
                } else {
                    System.out.print(table[i][j] + "     ");
                }

            }
            System.out.println();
        }
    }
}
