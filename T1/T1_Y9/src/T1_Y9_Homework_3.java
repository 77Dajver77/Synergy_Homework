import java.io.IOException;
import java.io.InputStream;

// 3.Используя System.in (без сканнера),считайте слово до пробела. Макс размер слова 10 символов.
public class T1_Y9_Homework_3 {
    public static void main(String[] args) throws IOException {
        InputStream x = System.in;
        int step = 0, y = 1;
        System.out.print("Введите слово: ");
        while ((y != 32) && (step <10)) {
           y =  x.read();
           System.out.print((char) y);
           step++;
       }
    }
}
