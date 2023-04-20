
public class Figure {
    char[][] figure = new char[10][10];
    char[][] фигураДвиж = new char[10][10];

    char[][] getFigure() {                                                      //Получение фигуры
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.figure[x][y] = ' ';
            }
        }
        int x = (int) (Math.random() * 7);
        int y = (int) (Math.random() * 2);
        for (int horizontal = x; horizontal <= x + y; horizontal++) {
            this.figure[0][horizontal] = 'X';
        }
        y = (int) (Math.random() * 3);
        for (int horizontal = x; horizontal <= y + x; horizontal++) {
            this.figure[1][horizontal] = 'X';
        }
        return this.figure;
    }


    void copyArrayMove() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.фигураДвиж[x][y] = this.figure[x][y];
            }
        }
    }

    void copyArrayYesMove() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.figure[x][y] = this.фигураДвиж[x][y];
            }
        }
    }

    boolean shiftDown(char[][] array) {                                // Перемещение фигуры вниз
        copyArrayMove();
        for (int x = 8; x >= 0; x--) {
            for (int y = 0; y <= 9; y++) {

                if (this.фигураДвиж[x][y] == 'X') {
                    this.фигураДвиж[x + 1][y] = 'X';
                    this.фигураДвиж[x][y] = ' ';
                }
            }
        }
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if ((фигураДвиж[x][y] == 'X') && (array[x][y] == 'X')) {
                    return false;
                }
                if ((фигураДвиж[x][y] == 'X') && (x == 9)) {
                    copyArrayYesMove();
                    return false;
                }
            }
        }
        copyArrayYesMove();
        return true;
    }

    boolean shiftRight(char[][] array) {                                // Перемещение фигуры вправо.
        copyArrayMove();
        boolean endShiftRight = false;

        for (int line = 0; line < 9; line++) {
            if (this.фигураДвиж[line][9] == 'X') {
                endShiftRight = true;
                break;
            }
        }

        if (!endShiftRight) {
            for (int col = 9; col >= 0; col--) {
                for (int line = 0; line < 9; line++) {
                    if (this.фигураДвиж[line][col] == 'X') {
                        this.фигураДвиж[line][col] = ' ';
                        this.фигураДвиж[line][col + 1] = 'X';
                    }
                }
            }

        }

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if ((this.фигураДвиж[x][y] == 'X') && (array[x][y] == 'X')) {
                    return false;
                }
                if ((this.фигураДвиж[x][y] == 'X') && (x == 9)) {
                    copyArrayYesMove();
                    return false;
                }
            }
        }
        copyArrayYesMove();
        return true;
    }

    boolean shiftLeft(char[][] array) {                                // Перемещение фигуры влево.
        copyArrayMove();
        boolean endShiftLeft = false;
        for (int line = 0; line < 9; line++) {
            if (this.фигураДвиж[line][0] == 'X') {
                endShiftLeft = true;
                break;
            }
        }

        if (!endShiftLeft) {
            for (int col = 0; col <= 9; col++) {
                for (int line = 0; line < 9; line++) {
                    if (this.фигураДвиж[line][col] == 'X') {
                        this.фигураДвиж[line][col] = ' ';
                        this.фигураДвиж[line][col - 1] = 'X';
                    }
                }
            }

        }

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if ((фигураДвиж[x][y] == 'X') && (array[x][y] == 'X')) {
                    return false;
                }
                if ((фигураДвиж[x][y] == 'X') && (x == 9)) {
                    copyArrayYesMove();
                    return false;
                }
            }
        }
        copyArrayYesMove();
        return true;
    }


}