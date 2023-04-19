// 11. Сохраните снимки NASA за январь 2022 года.

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

public class T2_Y2_Homework_11 {
    public static void main(String[] args) throws IOException {
        int intDate = 1;
        String strDate = new String();
        if (intDate < 10) {
            strDate = "0" + intDate;
        } else {
            strDate = String.valueOf(intDate);
        }
        String strNasa;
        while (intDate < 32) {
            if (intDate < 10) {
                strDate = "0" + intDate;
            } else {
                strDate = String.valueOf(intDate);
            }
            strNasa = downoloadWebPAge("https://api.nasa.gov/planetary/apod?date=2022-10-" + strDate + "&api_key=DEMO_KEY");
            int startIndex = strNasa.indexOf("https://apod.nasa");
            if (startIndex > 0) {
                int endIndex = strNasa.indexOf(".jpg", startIndex);
                URL url = new URL(strNasa.substring(startIndex, endIndex + 4));
                InputStream inputStream = url.openStream();
                Files.copy(inputStream, new File("C:\\Nasa\\Nasa" + strDate + ".jpg").toPath());
            } else {
                System.out.println("На введенную дату в NASA нет картинки");
            }
            intDate++;
        }
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
