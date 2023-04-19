import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

//7.  Сохраняйте снимки NASA с1 января того момента, пока в поле Explanation нет слова “Earth”.
public class T3_Y6_Homework_7 {
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
