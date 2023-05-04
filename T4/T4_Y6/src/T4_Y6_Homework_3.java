import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.util.Locale;
import java.util.Scanner;

//3.  Аналогичным образом, доработайте запрос курса валют на дату: при некорректном вводе бросайте исключение.


public class T4_Y6_Homework_3 {
    public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату.");
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        System.out.print("Год: ");
        int year = scanner.nextInt();
        if ( month >12 || year > 2023) {
            throw new RuntimeException("Не верная дата");                         // Добавление исключения
        }

        String dateString = "01/" + month + "/" + year;



        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String strDateStart = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int maxDate = date.lengthOfMonth();

        dateString = maxDate + "/" + month + "/" + year;
        date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String strDateEnd = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String page = downoloadWebPAge("http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=" + strDateStart + "&date_req2=" + strDateEnd + "&VAL_NM_RQ=R01235");

        int startIndex = page.indexOf("Record Date=");
        startIndex = startIndex + 13;
        int endIndex = startIndex + 10;
        String date_1 = page.substring(startIndex, endIndex);
        startIndex = endIndex + 41;
        endIndex = startIndex + 5;
        String rate_1 = page.substring(startIndex, endIndex);
        System.out.println();

        int step = 1;
        int len = page.length();
        double doubleRate = Double.parseDouble(rate_1.replace(",", "."));
        double rate_2 = doubleRate, differenceRate = 0, differenceRate_1 = 0;
        String strRateDate = date_1;


        while (step < maxDate) {
            startIndex = page.indexOf("Record Date=", endIndex);
            startIndex = startIndex + 13;
            endIndex = startIndex + 10;
            date_1 = page.substring(startIndex, endIndex);
            startIndex = endIndex + 41;
            endIndex = startIndex + 5;
            rate_1 = page.substring(startIndex, endIndex);
            step++;
            System.out.println(date_1 + "      " + rate_1);
            doubleRate = Double.parseDouble(rate_1.replace(",", "."));
            if (len - 40 < endIndex) step = maxDate;
            double doubleRate_1 = Double.parseDouble(rate_1.replace(",", "."));
            differenceRate_1 = rate_2 - doubleRate_1;
            differenceRate_1 = Math.abs(differenceRate_1);

            if (differenceRate < differenceRate_1) {
                differenceRate = doubleRate_1 - rate_2;
                strRateDate = date_1;
            }
            rate_2 = doubleRate_1;

        }
        System.out.println();
        if (differenceRate > 0)
            System.out.println(strRateDate + " - cамый большой скачок за " + Month.of(month).getDisplayName(TextStyle.FULL_STANDALONE, new Locale("RU"))
                    + " месяц, долар вырос на " + differenceRate);
        else
            System.out.println(strRateDate + "Самый большой скачок за " + Month.of(month).getDisplayName(TextStyle.FULL_STANDALONE, new Locale("RU"))
                    + " месяц, долар упал на " + differenceRate);

        date = LocalDate.parse(strRateDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Desktop.getDesktop().browse(new URI("https://ru.wikinews.org/wiki/Лента_новостей_" + date.getDayOfMonth()
                + "_" + Month.of(month).getDisplayName(TextStyle.FULL, new Locale("RU")) + "_" + date.getYear() + "_года"));

    }

    private static String downoloadWebPAge(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}