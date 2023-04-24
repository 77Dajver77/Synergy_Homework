//8.  Реализуйте метод, который принимает два LocalDate, и сохраняет все снимки дня NASA в указанный промежуток.

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;


public class T3_Y7_Homework_8 {
    public static void main(String[] args) throws IOException {

        int day = 10;
        int maxDate = 15;

        getPictures(day, maxDate);

    }

    private static void getPictures(int day, int maxDate) throws IOException {
        do {
            String strNasa = downoloadWebPAge("https://api.nasa.gov/planetary/apod?date=2022-05-" + day + "&api_key=d48fVAgbYDwpo8eJJYl53E7oc8JCgjbFcTAdiTvn");
            int startIndex = strNasa.indexOf("\"url\":\"");
            int endIndex = strNasa.lastIndexOf(".jpg");
            if (endIndex > 20) {
                URL url = new URL(strNasa.substring(startIndex + 7, endIndex + 4));
                InputStream inputStream = url.openStream();
                Files.copy(inputStream, new File("C:\\Nasa\\Nasa"+ day +".jpg").toPath());
            }
            day++;
        } while (day <= maxDate);
    }

    private static String downoloadWebPAge(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null){
                result.append(line);
            }
        }
        return result.toString();
    }
}
