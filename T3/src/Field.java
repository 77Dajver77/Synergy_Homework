import java.util.Scanner;

public class Field {
    char[][] field = new char[10][10];
    char[][] полеСфигурами = new char[10][10];

    Scanner scanner = new Scanner(System.in);

    char[][] initializationField() {                         //Инициализация поля

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.field[x][y] = ' ';
            }
        }
        return this.field;
    }

    void printField(char[][] chars) {                                      // Печать поля.
        char ch;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if ((this.field[x][y] == 'X' || chars[x][y] == 'X')) ch = 'X';
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
                    this.field[x][y] = 'X';
            }
        }
        return this.field;
    }

    boolean getLine() {                                                //Проверка линий на заполнение.
        int lineX = 0;
        for (int line = 0; line < 10; line++) {
            for (int col = 0; col < 10; col++) {
                {
                    if (this.field[line][col] == 'X')
                        lineX++;
                }
            }
            if (lineX == 10) {
                for (int col = 0; col < 10; col++) {
                    this.field[line][col] = ' ';
                }
                for (int line1 = line - 1; line1 > 0; line1--) {
                    for (int col1 = 0; col1 < 10; col1++) {
                        if (this.field[line1][col1] == 'X') {
                            this.field[line1][col1] = ' ';
                            this.field[line1 + 1][col1] = 'X';
                        }
                    }
                }
                return true;
            } else {
                lineX = 0;
            }
        }
        return false;
    }

    boolean gameOver() {                                //Проверка на конец игры.
        for (int x = 0; x < 10; x++) {
            if (this.field[0][x] == 'X') return true;
        }
        return false;
    }
}




