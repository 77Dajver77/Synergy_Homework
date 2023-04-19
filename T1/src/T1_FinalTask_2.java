
/* 2. Продвинутое, усложненное задание:
       - Пользователь вводит месяц и год. Вывести курс рубля за этот месяц, найти наибольший и наименьшие значения. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class T1_FinalTask_2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату.");
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        System.out.print("Год: ");
        int year = scanner.nextInt();

        String dateString = "01/"+ month + "/"+ year;                                            // Формируем дату запроса.
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String strDateStart = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));            // Приводим формат даты к требуемой для включения в запрос
        int maxDate = date.lengthOfMonth();                                                      // Узнаем количество дней в введенном месяце

        dateString = maxDate + "/"+ month + "/"+ year;
        date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String strDateEnd = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));              // Приводим формат даты к требуемой для включения в запрос

        String page = downoloadWebPAge ("http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1="+ strDateStart+"&date_req2="+strDateEnd+"&VAL_NM_RQ=R01235"); //Запрос в ЦБР

        int startIndex = page.indexOf("Record Date=");                                           // Поиск курса первого числа месяца из строки
        startIndex = startIndex+13;
        int endIndex = startIndex + 10;
        String date_1 = page.substring(startIndex,endIndex);
        startIndex = endIndex + 41;
        endIndex = startIndex + 5;
        String rate_1 = page.substring(startIndex,endIndex);
        System.out.println();

        System.out.println("Курс валюты за "+ Month.of(month).getDisplayName(TextStyle.FULL_STANDALONE, new Locale("RU")) + " месяц " + year +" года");
        System.out.println(date_1 +"      "+ rate_1);
        int step =1;                                                                           // Обьявляем переменные для цикла
        int len = page.length();
        double doubleRate = Double.parseDouble (rate_1.replace(",","."));    // Преобразуем тип данных string в double
        double maxRate = doubleRate;                                                          // Присваиваем исходные данные для дальнейшего поиска в цикле
        double minRate = doubleRate;
        String strMaxRateDate = date_1, strMinDateRate = date_1 ;

        while (step < maxDate ) {
            startIndex = page.indexOf("Record Date=", endIndex);                         // Поиск  даты
            startIndex = startIndex+13;
            endIndex = startIndex + 10;
            date_1 = page.substring(startIndex,endIndex);
            startIndex = endIndex + 41;                                                   // Поиск курса на указанную дату
            endIndex = startIndex + 5;
            rate_1 = page.substring(startIndex,endIndex);
            step++;
            System.out.println(date_1 +"      "+ rate_1);                               //Вывод даты и курса
            doubleRate = Double.parseDouble (rate_1.replace(",",".")); // Преобразуем тип данных string в double
            if (len-40 < endIndex) step = maxDate;                                      // Проверка конца строки
            if ( maxRate < doubleRate) {                                                // Поиск максимального курса
                maxRate=doubleRate;
                strMaxRateDate =  date_1;
            }
            if ( minRate > doubleRate) {                                                // Поиск минимального курса
                minRate=doubleRate;
                strMinDateRate =  date_1;
            }
        }
        System.out.println("Максимальный курс " + strMaxRateDate+"      "+maxRate );   // Вывод максимального курса
        System.out.println("Минимальный курс " + strMinDateRate+"      "+minRate );    // Вывод минимального курса
    }
    private static String downoloadWebPAge(String url) throws IOException {      // Хрен знает, что за блок но без него не работает. На уроках не проходили.
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
