//7.  Создайте класс TextChecker. Его конструктор принимает строку и внутри него будет происходить: Проверка текста на наличие инностранных букв вместо
//    русской раскладки и цифр вместо нуля и буквы «з». Если обнаружена такая подмена - выбрасывается исключение.
public class TextChecker {
    TextChecker(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'з') {
                throw new IllegalArgumentException();
            }
            if (text.charAt(i) == '0') {
                throw new IllegalArgumentException();
            }
            if (text.charAt(i) < 'а' || text.charAt(i) > 'я') {
                throw new IllegalArgumentException();
            }
        }
        System.out.println("Проверка пройдена успешно");
    }
}