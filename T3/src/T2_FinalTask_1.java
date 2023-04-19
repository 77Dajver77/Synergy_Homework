// Пусть у Вас будет поле 10х10 (двумерный массив char). В случайном месте генерируется фигура:
// можно начать с простых форм: …. :: … . : на Ваше усмотрение. Каждый ход считывайте от игрока: просто опустить фигуру,
// или ещё сдвинуть ее влево-вправо. Считайте количество очков: полностью выстроенных линий (таковые сгорают).
// Когда фигуре некуда упасть, игра закончена. В файл записывайте рекордное количество очков. Реализуйте по крайней мере два-три класса.
public class T2_FinalTask_1 {
    public static void main(String[] args) {
        char[][] arrayFigureMove = new char[10][10];
//        char[][] arrayFigure = new char[10][10];
//        char[][] arrayFieldMove = new char[10][10];
        char[][] arrayField = new char[10][10];
        char move;
        boolean end = true;
        Field field = new Field();
        Figure figure = new Figure();
        field.поле = field.initializationField();                 // Инициализация игрового поля.


        for (int y = 0; y < 100; y++) {
            figure.фигура = figure.getFigure();
            field.printField(figure.фигура);

            for (int x = 0; x < 1000; x++ ){
                move = field.request();
                if (move == 's') {
                    end = figure.shiftDown(field.поле);
                }
                if (move == 'a') {
                    end = figure.shiftLeft(field.поле);
                }
                if (move == 'd') {
                    end = figure.shiftRight(field.поле);
                }
                if (end == true) {
                    field.printField(figure.фигура);
                }else break;

            }
            field.getFieldFigure(figure.фигура);

        }




    }
}







