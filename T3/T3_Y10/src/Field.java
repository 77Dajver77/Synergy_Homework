import java.util.Scanner;

public class Field {
    char[][] field;
    int size = 20;
    int sizeFigure = 2;

    int[][] figure = {{9, 9}, {9, 10}, {9, 11}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},};
    int[][] wall = new int[5][2];
    int[][] fruits = new int[5][2];

    Scanner scanner = new Scanner(System.in);

    void initWall() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                wall[i][j] = (int) (Math.random() * 17 + 1);
            }
        }
    }

    void initFruits() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                fruits[i][j] = (int) (Math.random() * 17 + 1);
            }
        }
    }


    void initField() {
        this.field = new char[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                field[row][col] = ' ';
                if (col == 0 || col == size - 1) {
                    field[row][col] = 9116;
                }
                if (row == 0 || (row == size - 1)) {
                    field[row][col] = 8212;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                field[wall[i][0]][wall[i][1]] = 35;
                field[fruits[i][0]][fruits[i][1]] = 1148;
            }
        }
    }

    void getFieldFigure() {
        initField();
        for (int i = 0; i < 8; i++) {
            field[figure[i][0]][figure[i][1]] = 'X';
        }
        field[0][0] = 8212;
    }

    void printField() {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j]);
            }
        }

    }

    void move() {
        System.out.println();
        System.out.println("Введите команду");
        System.out.println("W - вверх, S - вниз, A - влево, D - вправо");
        char move = scanner.next().charAt(0);


        if (move == 'w') {
            moveFigure();
            figure[0][0] -= 1;
        } else if (move == 's') {
            moveFigure();
            figure[0][0] += 1;
        } else if (move == 'a') {
            moveFigure();
            figure[0][1] -= 1;
        } else if (move == 'd') {
            moveFigure();
            figure[0][1] += 1;
        }
    }

    void moveFigure() {
        for (int i = sizeFigure; i > 0; i--) {
            for (int j = 0; j < 2; j++) {
                figure[i][j] = figure[i - 1][j];
            }
        }
    }


    boolean gameOver() {
        char charField = field[figure[0][0]][figure[0][1]];
        if (charField == 9116 || charField == 8212 || charField == 35) {
            System.out.println("Вы проиграли");
            return true;
        } else if (getWinner()) {
            System.out.println("Вы выиграли");
            return true;
        }
        return false;
    }


    boolean getWinner() {
        for (int i = 0; i < 5; i++) {
            if ((fruits[i][0] == figure[0][0]) && (fruits[i][1] == figure[0][1])) {
                sizeFigure++;
                fruits[i][0] = 0;
                fruits[i][1] = 0;
            }
        }
        if (sizeFigure == 7) {
            return true;
        } else {
            return false;
        }
    }
}





