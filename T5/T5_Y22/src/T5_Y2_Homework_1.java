import java.io.IOException;
import java.net.URISyntaxException;

//1.  У класса FileInformation из предыдущих уроков сделайте метод toString, возвращающий информацию по всем полям.
//2.  Реализуйте класс, отображающий страничку в википедии. Пусть метод toString у него возвращает текст этой странички. Покажите его использование неявно, так:
//    WikiPage wikiPage = new WikiPage(“Java”); System.out.println(wikiPage);
//3.  Поймайте в дебаггере метод toString у класса String.
//4.  Поймайте в дебаггере метод toString у класса Object.
//5.  Поймайте в дебаггере метод toString у класса StringBuilder.

public class T5_Y2_Homework_1 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        FileInformation fileInformation = new FileInformation("Nasa", "C:", 100);
        System.out.println(fileInformation);

        WikiPage wikiPage = new WikiPage("Java");;
        System.out.println(wikiPage);
    }
}
