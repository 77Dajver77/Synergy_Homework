// 5.Сохраните снимок дня NASA в свой созданный класс.

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;


public class T3_Y1_Homework_5 {
    public static void main(String[] args) throws IOException {
        String strNasa;
        strNasa = downoloadWebPAge("https://api.nasa.gov/planetary/apod?date=2022-10-01&api_key=DEMO_KEY");
        int startIndex = strNasa.indexOf("https://apod.nasa");
        int endIndex = strNasa.indexOf(".jpg", startIndex);
        URL url = new URL(strNasa.substring(startIndex, endIndex + 4));
        InputStream inputStream = url.openStream();
        Files.copy(inputStream, new File("C:\\Nasa\\Nasa.jpg").toPath());
    }

    private static String downoloadWebPAge(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream(); BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
