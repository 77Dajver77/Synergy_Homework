import java.io.IOException;
import java.io.InputStream;

/* 5. Пользователь вводит 7символов. Используя System.in (без сканнера),
      считайте целое число до первой нецифры.(пример: «35 руб», ответ 35.) считаем,
      что первым пользователь всегда вводит цифру. */
public class T1_Y9_Homework_5 {
    public static void main(String[] args) throws IOException {
    InputStream x = System.in;
    int step = 0, y = 48;
    System.out.print("Введите символы: ");
    while ((y >= 48) && (step <7) && (y <=57 )) {
        y =  x.read();
        System.out.print((char) y);
        step++;
    }
}
}
