import java.io.*;

// Пусть у Вас будет поле 10х10 (двумерный массив char). В случайном месте генерируется фигура:
// можно начать с простых форм: …. :: … . : на Ваше усмотрение. Каждый ход считывайте от игрока: просто опустить фигуру,
// или ещё сдвинуть ее влево-вправо. Считайте количество очков: полностью выстроенных линий (таковые сгорают).
// Когда фигуре некуда упасть, игра закончена. В файл записывайте рекордное количество очков. Реализуйте по крайней мере два-три класса.
public class T2_FinalTask_1 {
    public static void main(String[] args) throws IOException {
        char[][] arrayFigureMove = new char[10][10];
        char[][] arrayField = new char[10][10];
        char move;
        boolean end = true;
        int point = 0;
        Field field = new Field();
        Figure figure = new Figure();
        field.field = field.initializationField();                 // Инициализация игрового поля.


        do {
            figure.figure = figure.getFigure();
            field.printField(figure.figure);

            do {
                System.out.println("У вас " + point + " очков");
                move = field.request();
                if (move == 's') {
                    end = figure.shiftDown(field.field);
                }
                if (move == 'a') {
                    end = figure.shiftLeft(field.field);
                }
                if (move == 'd') {
                    end = figure.shiftRight(field.field);
                }
                if (end) {
                    field.printField(figure.figure);
                }
            } while (end);
            field.getFieldFigure(figure.figure);
            if (field.getLine()) {
                point++;
            }

        } while (!field.gameOver());

        System.out.println("Вы прошли игру за " + point + " очков");
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Game.txt", true))); // true добавит новые данные
            out.println(point);
            out.close();
        } catch (
                IOException e) {
            System.out.println(e);
        }
    }
}










