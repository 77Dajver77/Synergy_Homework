//4.  Отрефакторите(улучшите читабельность) кода вашей реализации анализа курса валют.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class T3_Y7_Homework_4 {
    public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату.");
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        System.out.print("Год: ");
        int year = scanner.nextInt();

        String page = getStringRateMonth(month, year);                                            // Запрос с ЦБ на курс валюты за месяц

        int startIndex = page.indexOf("Record Date=");                                           // Поиск курса первого числа месяца из строки
        startIndex = startIndex+13;
        int endIndex = startIndex + 10;
        String date_1 = page.substring(startIndex,endIndex);
        startIndex = endIndex + 41;
        endIndex = startIndex + 5;
        String rate_1 = page.substring(startIndex,endIndex);
        double rate_2 = Double.parseDouble (rate_1.replace(",","."));
        double differenceRate = 0;
        String strRateDate = date_1;
        do {
            startIndex = page.indexOf("Record Date=", endIndex);                         // Поиск  даты
            startIndex = startIndex+13;
            endIndex = startIndex + 10;
            date_1 = page.substring(startIndex,endIndex);
            startIndex = endIndex + 41;                                                   // Поиск курса на указанную дату
            endIndex = startIndex + 5;
            rate_1 = page.substring(startIndex,endIndex);
            System.out.println(date_1 +"      "+ rate_1);                               //Вывод даты и курса

            double doubleRate_1 = Double.parseDouble (rate_1.replace(",","."));


            if ( differenceRate <  Math.abs (rate_2 - doubleRate_1)) {                                                // Поиск максимальной разницы
                differenceRate =  doubleRate_1 - rate_2;
                strRateDate =  date_1;
            }
            rate_2 = doubleRate_1;

        } while (!(page.length()-40 < endIndex));

        System.out.println();

        getExtracted(month, differenceRate, strRateDate);



    }

    private static String getStringRateMonth(int month, int year) throws IOException {
        String dateString = "01/"+ month + "/"+ year;                                            // Формируем дату запроса.
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String strDateStart = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));            // Приводим формат даты к требуемой для включения в запрос


        dateString = date.lengthOfMonth() + "/"+ month + "/"+ year;
        date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String strDateEnd = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));              // Приводим формат даты к требуемой для включения в запрос

        String page = downoloadWebPAge ("http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1="+ strDateStart+"&date_req2="+strDateEnd+"&VAL_NM_RQ=R01235"); //Запрос в ЦБР
        return page;
    }

    private static void getExtracted(int month, double differenceRate, String strRateDate) {
        if (differenceRate > 0 ) System.out.println(strRateDate + " - cамый большой скачок за "+ Month.of(month).getDisplayName(TextStyle.FULL_STANDALONE, new Locale("RU"))
                + " месяц, долар вырос на " + differenceRate);
        else System.out.println(strRateDate + "Самый большой скачок за "+ Month.of(month).getDisplayName(TextStyle.FULL_STANDALONE, new Locale("RU"))
                + " месяц, долар упал на " + differenceRate);
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