// Пусть у Вас будет поле 10х10 (двумерный массив char). В случайном месте генерируется фигура:
// можно начать с простых форм: …. :: … . : на Ваше усмотрение. Каждый ход считывайте от игрока: просто опустить фигуру,
// или ещё сдвинуть ее влево-вправо. Считайте количество очков: полностью выстроенных линий (таковые сгорают).
// Когда фигуре некуда упасть, игра закончена. В файл записывайте рекордное количество очков. Реализуйте по крайней мере два-три класса.




import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class T3_FinalTask_1 {
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


        String value;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("F:\\Java\\Synergy_Homework\\T3\\src\\Game.txt"))) {
             value = reader.readLine();
        }
       if (point > Integer.parseInt(value)) {
           System.out.println("Вы побили рекорд " + value);
           PrintWriter writerRecord = new PrintWriter("F:\\Java\\Synergy_Homework\\T3\\src\\Game.txt");
           writerRecord.println(point);
           writerRecord.close();


       }
    }
}










