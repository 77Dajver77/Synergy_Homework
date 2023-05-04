import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//5.  Пользователь вводит адрес ссылки. Если удаётся скачать страничку по адресу, сохранить ее в html файл; иначе вывести, что страница не найдена.

public class T4_Y7_Homework_5 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите url:");
        String url = scanner.nextLine();
        downoloadWebPAge(url);

    }

    private static String downoloadWebPAge(String url) throws Exception {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection;

        try {
            urlConnection = new URL(url).openConnection();

        }catch (Exception e){
            throw new Exception("Не рабочая ссылка");
        }

        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}