// Напишите программу, сохраняющую в файл статью из википедии «Дональд Кнут». Перед сохранением в файл замените все слова Кнут на Пряник
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class T1_Y2_Homework_18 {
    public static void main(String[] args) throws IOException {

    String sourceCode = downloadWebPage("https://ru.wikipedia.org/wiki/%D0%9A%D0%BD%D1%83%D1%82,_%D0%94%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%B4_%D0%AD%D1%80%D0%B2%D0%B8%D0%BD");
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

        BufferedWriter writer = new  BufferedWriter(new FileWriter("F:/Java/Кнут.html"));
        writer.write(str.replace("Кнут","Пряник"));
        writer.close();
    }
}

