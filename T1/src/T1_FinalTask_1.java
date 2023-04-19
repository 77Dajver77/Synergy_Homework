/* Анализатор курса валют.
 1.  Пользователь вводит дату.
     Произвести анализ курса валют на эту дату, предыдущую и следующую:
      - Вывести, все три  курса.
      - Насколько курс вырос/упал.
      - Наибольший и наименьшие значения из этих трех
      - Сохранить в отдельную директорию лучший снимок NASA за эту дату :) */


import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class T1_FinalTask_1 {
    public static void main(String[] args) throws IOException, URISyntaxException {

       Scanner scanner = new Scanner(System.in);                                                   // Ввод даты
        System.out.println("Введите дату.");
        System.out.print("День: ");
        int day = scanner.nextInt();
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        System.out.print("Год: ");
        int year = scanner.nextInt();

        String dateString = day +"/"+ month + "/"+ year;                                       // Формируем дату запроса, предыдущая от введенной даты
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
        String dateStrNasa = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));           //Формируем дату для запроса с API NASA
        date = date.minusDays(1);
        String strPreviousDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));  // Приводим формат даты к требуемой для включения в запрос

        date = date.plusDays(2);                                                // Формируем дату запроса, следующая от введенной даты
        String strNextDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));    // Приводим формат даты к требуемой для включения в запрос

        String page = downoloadWebPAge ("http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1="+strPreviousDate+"&date_req2="+strNextDate+"&VAL_NM_RQ=R01235"); // Запрос в ЦБР

        if (page.length()>400) {                                                         // Проверка наличие курса на эти даты
            int startIndex = page.indexOf("Record Date=");                                // Поиск предыдущей даты
            startIndex = startIndex+13;
            int endIndex = startIndex + 10;
            String date_1 = page.substring(startIndex,endIndex);                          // date_1 Предыдущая дата
            startIndex = endIndex + 41;                                                   // Поиск курса на предыдущую дату
            endIndex = startIndex + 5;
            String rate_1 = page.substring(startIndex,endIndex);                          //rate_1 Курс на предыдущую дату

            startIndex = page.indexOf("Record Date=", endIndex);                      // Поиск указанной  даты
            startIndex = startIndex+13;
            endIndex = startIndex + 10;
            String date_2 = page.substring(startIndex,endIndex);                          // date_2 Указанная дата
            startIndex = endIndex + 41;                                                   // Поиск курса на указанную дату
            endIndex = startIndex + 5;
            String rate_2 = page.substring(startIndex,endIndex);                             //rate_2 Курс на указанную дату

            startIndex = page.indexOf("Record Date=", endIndex);                      // Поиск указанной  даты
            startIndex = startIndex+13;
            endIndex = startIndex + 10;
            String date_3 = page.substring(startIndex,endIndex);                          // date_3 Указанная дата
            startIndex = endIndex + 41;                                                   // Поиск курса на указанную дату
            endIndex = startIndex + 5;
            String rate_3 = page.substring(startIndex,endIndex);                          //rate_3 Курс на указанную дату

            double doubletRate_1 = Double.parseDouble (rate_1.replace(",",".")); // Преобразуем тип данных string в double
            double doubletRate_2 = Double.parseDouble (rate_2.replace(",","."));
            double doubletRate_3 = Double.parseDouble (rate_3.replace(",","."));

            double maxRate = doubletRate_1, minRate=doubletRate_1 ;
            String maxDate = date_1, minDate =date_1 ;

            if (doubletRate_1 < doubletRate_2) {                                      // Поиск максимального курса за три дня
                maxRate = doubletRate_2;
                maxDate = date_2;
                if (maxRate < doubletRate_3) {
                    maxRate = doubletRate_3;
                    maxDate = date_3;
                }
            } else if (doubletRate_1 < doubletRate_3) {
                maxRate = doubletRate_3;
                maxDate = date_3;
            }

            if (doubletRate_1 > doubletRate_2) {                                              // Поиск минимального курса за три дня
                minRate = doubletRate_2;
                minDate = date_2;
                if (minRate > doubletRate_3) {
                    minRate = doubletRate_3;
                    minDate = date_3;
                }
            } else if (doubletRate_1 > doubletRate_3) {
                minRate = doubletRate_3;
                minDate = date_3;
            }

            System.out.println(date_1 + " - " + doubletRate_1);                                         // Вывод курса валют за три дня
            System.out.println(date_2 + " - " + doubletRate_2);
            System.out.println(date_3 + " - " + doubletRate_3);

            if (doubletRate_3 > doubletRate_1 ) System.out.println("Курс вырос на " + (doubletRate_3 - doubletRate_1));  // Вывод вырос/упал курс за три дня
            else System.out.println("Курс упал на " + (doubletRate_1 - doubletRate_3));

            System.out.println("Максимальный курс "+ maxDate + " " + maxRate);                           // Вывод максимального/минимального курса за три дня
            System.out.println("Минимальный курс "+ minDate + " " + minRate);
        }
        else System.out.println("На указанную дату нет курса,(воскресенье, понидельник, празднечный день ЦБР курс не выставляет) попробуйте изменить дату");     // В случаии отсутствия курса на указанные даты

        String strNasa= downoloadWebPAge ("https://api.nasa.gov/planetary/apod?date=" + dateStrNasa + "&api_key=DEMO_KEY"); // Запрос в NASA
        int startIndex = strNasa.indexOf("https://apod.nasa");                                // Поиск ссылки на картинку
        if (startIndex > 0) {                                                                 // Проверяем существование URL ссылки на jpg файл, бывают даты с видео
            int endIndex = strNasa.indexOf(".jpg", startIndex);
            try {                                                                                // Удаляем файл, если файл сущесивует то дальше не сможем создать файл
                Files.deleteIfExists(Paths.get("C:\\Nasa\\Nasa.jpg"));
            } catch (IOException e) {
                System.err.println(e);
            }
            URL url = new URL(strNasa.substring(startIndex, endIndex + 4));                       // Создаем файл с полученной картинкой
            InputStream inputStream = url.openStream();
            Files.copy(inputStream, new File("C:\\Nasa\\Nasa.jpg").toPath());
        } else System.out.println("На введенную дату в NASA нет картинки");
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
