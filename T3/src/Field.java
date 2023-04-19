import java.util.Scanner;

public class Field {
    char[][] поле = new char[10][10];
    char[][] полеСфигурами = new char[10][10];

    Scanner scanner = new Scanner(System.in);

    char[][] initializationField() {                         //Инициализация поля

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.поле[x][y] = ' ';
            }
        }
        return this.поле;
    }

    void printField(char[][] chars) {                                      // Печать поля.
        char ch;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if ((this.поле[x][y] == 'X' || chars[x][y] == 'X')) ch = 'X';
                else ch = ' ';
                if (y == 0) {
                    System.out.print("|" + ch);
                    continue;
                }
                if (y == 9) {
                    System.out.print(ch + "|");
                    continue;
                }
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("````````````");
    }


    char request() {                                                         //Запрос на движение фигуры.
        System.out.println("Вниз s, Вправо d, Влево a ");
        char moving = scanner.next().charAt(0);
        return moving;
    }

    char[][] getFieldFigure(char[][] фигура) {                 //Получение поля c фигурами.
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (фигура[x][y] == 'X')
                    this.поле[x][y] = 'X';
            }
        }
        return this.поле;
    }
}

//        boolean checkLine (char[][] arrayField ) {                                             //Проверка строк на полное заполнение.
//            int z = 0;
//            for (int x = 0; x < 10; x++) {
//                for (int y = 0; y < 10; y++) {
//                    if (arrayField[x][y] == 'X') {
//                        z++;
//                    }
//                    if (z == 10) {
//                        for (int line = 0; line < 10; line++) {
//                            arrayField[x][line] = ' ';
//                        }
//                    }
//                }
//            }
//            return true;
//        }



