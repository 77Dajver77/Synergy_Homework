// Напишите программу, сохраняющую в файл статью из википедии  «Проблема 2000 года». Прочитайте её.

import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class T1_Y2_Homework_17 {
    public static void main(String[] args) throws IOException {

        String sourceCode = downloadWebPage("https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D0%B1%D0%BB%D0%B5%D0%BC%D0%B0_2000_%D0%B3%D0%BE%D0%B4%D0%B0");
        writeToFile(sourceCode);

    }

    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;

        URLConnection urlConnection = new URL(url).openConnection();

        try (InputStream is = urlConnection.getInputStream()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                while ((line = br.readLine()) != null) {
                    result.append(line);
                }

            }
        }

        return result.toString();

    }
public static void writeToFile(String str) throws IOException {

    BufferedWriter writer = new  BufferedWriter(new FileWriter("F:/Java/2000.html"));
    writer.write(str);
    writer.close();
}
}

