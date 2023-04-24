//6.  Реализуйте метод, который выводит explanation сегодняшнего снимка дня NASA.
//7.  Реализуйте метод, который возвращает explanation снимка дня NASA, в качестве параметра принимайте LocalDate - дату, на которую нужно брать снимок.


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;


public class T3_Y7_Homework_6_7 {
    public static void main(String[] args) throws IOException {

        getExplanation();
        getExplanation("2023-04-24");

    }

    private static void getExplanation() throws IOException {
        String strNasa = downoloadWebPAge("https://api.nasa.gov/planetary/apod?date=" + LocalDate.now() + "&api_key=d48fVAgbYDwpo8eJJYl53E7oc8JCgjbFcTAdiTvn");
        int startIndexDescription = strNasa.indexOf("\"explanation\":\"");
        int endIndexDescription = strNasa.indexOf("\",\"hdurl\":");
        String strDescription = strNasa.substring(startIndexDescription + 15, endIndexDescription);
        System.out.println(strDescription);

    }

    private static void getExplanation(String LocalDate) throws IOException {
        String strNasa = downoloadWebPAge("https://api.nasa.gov/planetary/apod?date=" + LocalDate + "&api_key=d48fVAgbYDwpo8eJJYl53E7oc8JCgjbFcTAdiTvn");
        int startIndexDescription = strNasa.indexOf("\"explanation\":\"");
        int endIndexDescription = strNasa.indexOf("\",\"hdurl\":");
        String strDescription = strNasa.substring(startIndexDescription + 15, endIndexDescription);
        System.out.println(strDescription);

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
