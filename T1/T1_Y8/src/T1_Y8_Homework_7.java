//  7. Добавим вывод автора цитаты.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class T1_Y8_Homework_7 {
    public static void main(String[] args) throws IOException {
        String page = downoloadWebPAge ("https://api.breakingbadquotes.xyz/v1/quotes");
        int startIndex = page.lastIndexOf("quote");
        int endIndex = page.indexOf("author");
        String quote = page.substring(startIndex+8,endIndex-3);
        int startAuthor = page.lastIndexOf("author");
        int endAuthor = page.lastIndexOf("}]");
        String author = page.substring(startAuthor+9,endAuthor-1);
        System.out.println(quote);
        System.out.println("(" + author + ")");

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

