// Пользователь вводит месяц и год.
// Скачать все снимки за месяц в папку.
// Сгенерировать html страницу в этой папке, которая отобразит все скачанные снимки на одной странице.



import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T2_FinalTask {
    public static void main(String[] args) throws IOException {
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
        int maxDate = date.lengthOfMonth();                                                      // Узнаем количество дней в введенном месяце
        PrintWriter writerNasa = new PrintWriter("C:\\Nasa\\Nasa.html");
        File fileNasa = new File( "C:\\Nasa\\Nasa.html" );
        fileNasa.createNewFile();
        do {
            String strNasa = downoloadWebPAge("https://api.nasa.gov/planetary/apod?date=" + dateStrNasa + "&api_key=d48fVAgbYDwpo8eJJYl53E7oc8JCgjbFcTAdiTvn");
            int startIndexDescription = strNasa.indexOf("\"explanation\":\"");
            int endIndexDescription = strNasa.indexOf("\",\"hdurl\":");
            int startIndex = strNasa.indexOf("\"url\":\"");
            int endIndex = strNasa.lastIndexOf(".jpg");
            if (endIndex > 20) {                                                                            // Проверяем существование URL ссылки на jpg файл, бывают даты с видео
                URL url = new URL(strNasa.substring(startIndex + 7, endIndex + 4));                         // Создаем файл с полученной картинкой
                InputStream inputStream = url.openStream();
                Files.copy(inputStream, new File("C:\\Nasa\\Nasa"+ day+".jpg").toPath());
                String strDescription = strNasa.substring(startIndexDescription + 15, endIndexDescription);
                writerNasa.println("<img src=\"Nasa"+ day+".jpg\"><p>"+strDescription+"<p>");
            }
            day++;
            dateString = day + "/" + month + "/" + year;
            date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
            dateStrNasa = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        } while (day <= maxDate);
        writerNasa.close();
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
