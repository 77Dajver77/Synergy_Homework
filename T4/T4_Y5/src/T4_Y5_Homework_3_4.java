//3.  В 12 часов 1 января 2020 года вы вылетаете из Москвы во Владивосток, длительность полета составляет 10 часов 15 минут.
//    Вопрос в том, во сколько вы приедете во Владивосток? Используйте ZonedDateTime
//4.  Пользователь вводит дату, вывести все числа с 1 января того же года до этой даты.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;



public class T4_Y5_Homework_3_4 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 1, 12, 0, 0);
        localDateTime = localDateTime.plusHours(10).plusMinutes(15);
        ZonedDateTime zonedDateTimeMoscow = localDateTime.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDateTimeMoscow);
        ZonedDateTime zonedDateTimeVladivostok = zonedDateTimeMoscow.withZoneSameInstant(ZoneId.of("Asia/Vladivostok"));
        System.out.println(zonedDateTimeVladivostok);


        System.out.println("Введите дату в формате ГГГГ-ММ-ДД");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date);
        LocalDate localDate1 = LocalDate.of(localDate.getYear(), 1, 1);
        for (int i = 0; i < localDate.getDayOfYear(); i++) {
            System.out.println(localDate1.plusDays(i));

        }


    }
}
