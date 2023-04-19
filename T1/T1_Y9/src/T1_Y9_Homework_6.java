// 6. Аналогично 5 задаче, но пользователь всегда вводит дробное число (пример ввода: «3.5 кг»
import java.io.IOException;
import java.io.InputStream;

public class T1_Y9_Homework_6 {
    public static void main(String[] args) throws IOException {
        InputStream x = System.in;
        int step = 0, y = 48;
        System.out.print("Введите символы: ");
        while (((y >= 48) && (y <=57 ) || y==46 )&& (step <7)) {
            y =  x.read();
            System.out.print((char) y);
            step++;
        }
    }
}
