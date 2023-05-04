//1.  Выведите все даты текущего года.
//2.  “Нарисуйте” календарь:
//     январь
//     пн вт ср чт пт сб вс
//     1  2   3   4  5   6
//         ... и так далее
import java.time.LocalDate;



public class T4_Y5_Homework_1_2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 01, 01);
        int longYear = localDate.lengthOfYear();
        for (long x = 0; x < longYear; x++) {
            System.out.println(localDate.plusDays(x));
        }
        localDate = LocalDate.of(2023, 01, 01);
        String[] days = new String[42];
        initDays(days);
        int dayDays = 0;
        String dayMonth;

        for (long x = 0; x < longYear; x++) {
            if (localDate.plusDays(x).getDayOfMonth() == 1) {
                System.out.println();
                System.out.println(localDate.plusDays(x).getMonth());
                System.out.println("пн    вт    ср    чт    пт    сб    вс");
                dayDays = localDate.plusDays(x).getDayOfWeek().getValue();
            }

            dayMonth = String.valueOf(localDate.plusDays(x).getDayOfMonth());
            if (localDate.plusDays(x).getDayOfMonth() < 10) {
                days[dayDays] = (dayMonth + "     ");
            } else days[dayDays] = (dayMonth+ "    ");

            dayDays++;


            if (localDate.plusDays(x).getDayOfMonth() == localDate.plusDays(x).lengthOfMonth()) {
                printDays(days);
                initDays(days);
                dayDays = 0;
            }


        }
    }


    static void initDays(String[] days) {
        days[0] = "";
        days[1] = "      ";
        days[2] = "      ";
        days[3] = "      ";
        days[4] = "      ";
        days[5] = "      ";
        days[6] = "      ";


        for (int i = 7; i < days.length; i++) {
            days[i] = " ";
        }
    }

    static void printDays(String[] days) {
        for (int i = 1; i < days.length; i++) {
            System.out.print(days[i]);
            if (i==7 || i==14 || i==21 || i==28 || i==35) {
                System.out.println();
            }
        }

    }

}




