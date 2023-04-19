// 10.Выведите курс валют за 1 число каждого месяца в 2014 году.
// 11.Выведите курс валют за 1 февраля  каждого года с 1994 до текущего года.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class T2_Y3_Homework_10 {
    public static void main(String[] args) throws IOException {
        for (int x = 1; x <= 12; x++) {
            String month = x < 10 ? "0" + x : String.valueOf(x);
            String page = downoloadWebPAge("http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=01/" + month + "/2014&date_req2=02/" + month + "/2014&VAL_NM_RQ=R01235");
            int startIndex = page.indexOf("<Value>");
            if (startIndex < 10) {
                System.out.println("01." + month + ".2014   Нет курса");
            } else {
                startIndex = startIndex + 7;
                int endIndex = startIndex + 5;
                String date_1 = page.substring(startIndex, endIndex);
                System.out.print("01." + month + ".2014   ");                                                              // Вывод курса валют за 1 число каждлгл месяца 2014 года
                System.out.println(date_1);
            }
        }
        for (int x = 1994; x <= 2023; x++) {
            String year =  String.valueOf(x);
            String page = downoloadWebPAge("http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=01/02/" + year + "&date_req2=02/02/" + year + "&VAL_NM_RQ=R01235");
            int startIndex = page.indexOf("<Value>");
            if (startIndex < 10) {
                System.out.println("01.02." + year + "   Нет курса");
            } else {
                startIndex = startIndex + 7;
                int endIndex = startIndex + 7;
                String date_1 = page.substring(startIndex, endIndex);
                System.out.print("01.02." + year + "  ");                                                              // Вывод курс валют за 1 февраля  каждого года с 1994 до текущего года.
                System.out.println(date_1);
                //System.out.println(page);
            }
        }


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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }
}
