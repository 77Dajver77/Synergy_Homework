// 6.  Возьмем код с 5 задания и используем тернарные операторы.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class T1_Y8_Homework_6 {
    public static void main(String[] args) throws IOException {
        String page = downoloadWebPAge ("https://api.breakingbadquotes.xyz/v1/quotes");
        int startIndex = page.lastIndexOf("quote");
        int endIndex = page.indexOf("author");
        String quote = page.substring(startIndex+8,endIndex-3);
        quote = (quote.length() > 50 ) ?  (quote.substring(0,50) + "..."): quote; // Используем тернарный оператор
        System.out.println(quote);
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
