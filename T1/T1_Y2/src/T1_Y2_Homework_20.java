//  Сложная. Напишите программу, которая сохраняет в разные файлы 50 случайных статей из Википедии
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class T1_Y2_Homework_20 {

    public static void main(String[] args) throws IOException {

        while (x <= 50) {

            String sourceCode = downloadWebPage("https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
            writeToFile(sourceCode);

        }
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

        BufferedWriter writer = new  BufferedWriter(new FileWriter("F:/Случайная статья"+ x +".html"));
        writer.write(str);
        writer.close();
    x++;
    }

    public static int x = 1;
}