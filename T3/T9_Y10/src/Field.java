public class Field {
    char[][] field;
    int size = 20;

    void initField() {
        this.field = new char[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                field[row][col] = ' ';
            }
        }
        System.out.println("Инициализация поля");
        this.printField();
    }
    void printField() {
        System.out.print("   ");
        for (int i = 1; i <= size; i++) {
            System.out.print("  ");
        }
        System.out.println();
        System.out.print("  ");
        for (int i = 1; i <= size; i++) {
            System.out.print("_");
        }

        System.out.println();
        for (int row = 0; row < size; row++) {
            int rowNumber = row + 1;
            System.out.print( " |");
            for (int col = 0; col < size; col++) {
                System.out.print(this.field[row][col] );
            }
            System.out.println();
        }
    }
}
