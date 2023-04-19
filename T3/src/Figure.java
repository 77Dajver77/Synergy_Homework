
public class Figure {
    char[][] фигура = new char[10][10];
    char[][] фигураДвиж = new char[10][10];

    char[][] getFigure() {                                                      //Получение фигуры
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.фигура[x][y] = ' ';
            }
        }
        int x = (int) (Math.random() * 7);
        int y = (int) (Math.random() * 2);
        for (int horizontal = x; horizontal <= x + y; horizontal++) {
            this.фигура[0][horizontal] = 'X';
        }
        y = (int) (Math.random() * 3);
        for (int horizontal = x; horizontal <= y + x; horizontal++) {
            this.фигура[1][horizontal] = 'X';
        }
        return this.фигура;
    }

  


    void copyArrayMove() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.фигураДвиж[x][y] = this.фигура[x][y];
            }
        }
    }

    void copyArrayYesMove() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.фигура[x][y] = this.фигураДвиж[x][y];
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
        for (int x = 0; x < 9; x++) {
            for (int y = 9; y >= 0; y--) {
                if (((this.фигураДвиж[x][y] == 'X') || (this.фигураДвиж[x + 1][y] == 'X')) && (y == 9))break;
                if (((this.фигураДвиж[x][y] == 'X') || (this.фигураДвиж[x + 1][y] == 'X')) && (y < 9)) {
                    if (this.фигураДвиж[x][y] == 'X') {
                        this.фигураДвиж[x][y + 1] = 'X';
                        this.фигураДвиж[x][y] = ' ';
                        endShiftRight = true;
                    }
                    if (this.фигураДвиж[x + 1][y] == 'X') {
                        this.фигураДвиж[x + 1][y + 1] = 'X';
                        this.фигураДвиж[x + 1][y] = ' ';
                    }

                }
            }
            if (endShiftRight) break;
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

    boolean shiftLeft(char[][] array) {                                // Перемещение фигуры влево.
        copyArrayMove();
        boolean endShiftLeft = false;
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y >= 9; y++) {
                if (((this.фигураДвиж[x][y] == 'X') || (this.фигураДвиж[x + 1][y] == 'X')) && (y == 0))break;
                if (((this.фигураДвиж[x][y] == 'X') || (this.фигураДвиж[x + 1][y] == 'X')) && (y > 0)) {
                    if (this.фигураДвиж[x][y] == 'X') {
                        this.фигураДвиж[x][y - 1] = 'X';
                        this.фигураДвиж[x][y] = ' ';
                        endShiftLeft = true;
                    }
                    if (this.фигураДвиж[x + 1][y] == 'X') {
                        this.фигураДвиж[x + 1][y - 1] = 'X';
                        this.фигураДвиж[x + 1][y] = ' ';
                    }

                }
            }
            if (endShiftLeft) break;
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