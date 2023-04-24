import java.util.Scanner;




    public class X0Game {
        FieldX0 gameField;
        Scanner scanner = new Scanner(System.in);
        char whoMakeNextTurn;
        boolean gameOver = false;

        void setupNewGame() {
            System.out.println("Новая игра");
            this.gameField = new FieldX0();
            this.gameField.initField();
        }

        void play() {
            this.setupNewGame();
            System.out.println("Кто ходит первым?: ");
            char first = this.scanner.next().charAt(0);
            if (first == 'X' || first == '0') {
                this.whoMakeNextTurn = first;
            } else {
                System.out.println("Первый ход Х");
                this.whoMakeNextTurn = 'X';
            }
            while (!gameOver) {
                turn();
                this.gameOver = this.gameField.isGameOver(this.whoMakeNextTurn);
                if (this.gameOver) {
                    System.out.println(this.whoMakeNextTurn + " Победа!");
                }
                if (this.whoMakeNextTurn == 'X') {
                    this.whoMakeNextTurn = '0';
                } else {
                    this.whoMakeNextTurn = 'X';
                }
            }
            System.out.println("Конец.");
        }

        void turn() {
            System.out.println(this.whoMakeNextTurn + ", Ваш ход. ");
            System.out.print("Выбирите строку: ");
            int rowNumber = this.scanner.nextInt();
            System.out.print("Выбирете колонку: ");
            int colNumber = this.scanner.nextInt();
            int rowIndex = rowNumber - 1;
            int colIndex = colNumber - 1;
            if (this.gameField.isPlaceFree(rowIndex, colIndex)) {
                this.gameField.setValue(rowIndex, colIndex, whoMakeNextTurn);
                this.gameField.printField();
            } else {
                System.out.println("Невозможно выбрать эту клетку. Попробуйте еще раз.");
                turn();

            }
        }
    }