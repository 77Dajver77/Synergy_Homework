//9.  Предыдущее задание, но с русским алфавитом.
public class T3_Y9_Homework_9 {
    public static void main(String[] args) {
        char[][] array = new char[3][11];
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char) ('а' + z);
                System.out.print(array[i][j] + "     ");
                if (array[i][j] == 'я') break;
                z++;
            }
            System.out.println();
        }

    }
}
