// 6. Есть 2 файла по 5 строк в каждом. Сохраните их в 2 массива. Создайте
//    третий массив из 10 строк, скопируйте в него строки из первых двух
//    массивов.


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class T2_Y5_Homework_6 {
    public static void main(String[] args) throws FileNotFoundException {
       String strFist[] = new String[5];
       String strSecond[] = new String[5];
       String strTotal[] = new  String[10];
       InputStream streamFist = new FileInputStream("F:\\Java\\T2_Y5_Homework\\src\\fist");
       Scanner scannerFist = new Scanner(streamFist);
       InputStream streamSecond = new FileInputStream("F:\\Java\\T2_Y5_Homework\\src\\second");
       Scanner scannerSecond = new Scanner(streamSecond);
       for (int x = 0; x < 5; x++){
           strFist[x] = scannerFist.nextLine();
           strSecond[x] = scannerSecond.nextLine();
       }
       int i = 0;
       for (int x = 0; x < 5; x++){
            strTotal[i] = strFist[x];
            i++;
            strTotal[i] = strSecond[x];
            i++;
        }
        System.out.println();
    }
}
