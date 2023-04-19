// 2. Используя System.in (без сканнера), считайте слово из 5 букв.

import java.io.IOException;
import java.io.InputStream;

public class T1_Y9_Homework_2 {
    public static void main(String[] args) throws IOException {
        InputStream x = System.in;
        char y = (char) x.read();
        char z =  (char) x.read();
        char q = (char) x.read();
        char w =  (char) x.read();

        System.out.print(y);
        System.out.print(z);
        System.out.print(q);
        System.out.print(w);
    }
}
