//8.  Создайте матрицу char[][], проинициализируйте ее латинским алфавитом, выведите его. Подсказка - можно получить первую букву как char ch = ‘a’,
//    следующую - как ch + 1, и так далее.
public class T3_Y9_Homework_8 {
    public static void main(String[] args) {
        char[][] array = new char[2][13];
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char) ('a' + z);
                System.out.print(array[i][j] + "     ");
                z++;
            }
            System.out.println();
        }

    }
}
