import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//7.  Доработайте скачивальщик снимков NASA, чтобы в нем не было ни одного throws (пройдитесь прям поиском по файлу). Throws придётся заменить на try catch.
public class T4_Y7_Homework_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату.");
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        System.out.print("Год: ");
        int year = scanner.nextInt();
        int day = 1;
        String dateString = day + "/" + month + "/" + year;
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String dateStrNasa = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int maxDate = 2;
        PrintWriter writerNasa;
        try {
            writerNasa = new PrintWriter("C:\\Nasa\\Nasa.html");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        File fileNasa = new File("C:\\Nasa\\Nasa.html");
        try {
            fileNasa.createNewFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        do {
            String strNasa = downoloadWebPAge("https://api.nasa.gov/planetary/apod?date=" + dateStrNasa + "&api_key=d48fVAgbYDwpo8eJJYl53E7oc8JCgjbFcTAdiTvn");
            int startIndexDescription = strNasa.indexOf("\"explanation\":\"");
            int endIndexDescription = strNasa.indexOf("\",\"hdurl\":");
            int startIndex = strNasa.indexOf("\"url\":\"");
            int endIndex = strNasa.lastIndexOf(".jpg");
            URL url;
            InputStream inputStream;
            if (endIndex > 20) {                                                                            // Проверяем существование URL ссылки на jpg файл, бывают даты с видео
                try {
                    url = new URL(strNasa.substring(startIndex + 7, endIndex + 4));
                    inputStream = url.openStream();
                    Files.copy(inputStream, new File("C:\\Nasa\\Nasa" + day + ".jpg").toPath());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

                String strDescription = strNasa.substring(startIndexDescription + 15, endIndexDescription);
                writerNasa.println("<img src=\"Nasa" + day + ".jpg\"><p>" + strDescription + "<p>");
            }
            day++;
            dateString = day + "/" + month + "/" + year;
            date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
            dateStrNasa = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        } while (day <= maxDate);
        writerNasa.close();
    }

    private static String downoloadWebPAge(String url) {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection;
        try {
            urlConnection = new URL(url).openConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            try (InputStream is = urlConnection.getInputStream();
                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                while ((line = br.readLine()) != null) {
                    result.append(line);
                }
            }
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
