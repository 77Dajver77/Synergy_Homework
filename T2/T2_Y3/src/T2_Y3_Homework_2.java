// 2.Сохраните миллион файлов. Получилось? - Получилось. Время выполнение программы 21 минута.

import java.io.File;
import java.io.IOException;

public class T2_Y3_Homework_2 {
    public static void main(String[] args) throws IOException {
        for (int x = 1; x <= 1000000; x++){
            File fileFirstPlayer = new File( "Fist" +x );
            fileFirstPlayer.createNewFile();
        }
    }
}
