import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//1.  Пользователь вводит 5 названий файлов. Они могут повторяться. Сохраните в каждый из файл названия ВСЕХ 5 файлов, используйте try with resources.
//2.  Пользователь вводит 5 названий файлов. Сохраните в каждый из файл названия ВСЕХ 5 файлов, используйте try.. catch..finally.
public class T4_Y8_Homework_1_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] files = new String[5];
        File file;
        for (int i = 0; i < files.length; i++) {
            System.out.println("Введите названиие файла");
            files[i] = scanner.nextLine();
            file = new File(files[i]);
            file.createNewFile();

        }
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < files.length; j++) {
                if (i != j) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(files[i],true))) {
                        writer.write(files[j] + "\n");
                    } catch (IOException e) {
                        throw e;
                    }
                }

            }
        }

        for (int i = 0; i < files.length; i++) {
                for (int j = 0; j < files.length; j++) {
                if (i != j) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(files[i],true));
                    try {
                        writer.write(files[j] + "\n");
                    } catch (IOException e) {
                        throw e;
                    }finally {
                        writer.close();
                    }
                }

            }
        }


    }
}
