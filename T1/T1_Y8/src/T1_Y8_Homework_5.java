

// 5.  Возьмем код с 4 задания и добавим определение длины цитаты.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class T1_Y8_Homework_5 {
    public static void main(String[] args) throws IOException {
        String page = downoloadWebPAge ("https://api.breakingbadquotes.xyz/v1/quotes");
        int startIndex = page.lastIndexOf("quote");
        int endIndex = page.indexOf("author");
        String quote = page.substring(startIndex+8,endIndex-3);
        if (quote.length() > 50 ) System.out.println(quote.substring(0,50) + "..."); // Обрезаем цитату если она длинней 50 символов
        else System.out.println(quote);
    }

    private static String downoloadWebPAge(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try ( InputStream is = urlConnection.getInputStream();
              BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null){
                result.append(line);
            }
        }
        return result.toString();
    }
}
