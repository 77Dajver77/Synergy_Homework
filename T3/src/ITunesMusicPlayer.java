import java.awt.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ITunesMusicPlayer {
    void playSong(String searchRequest) throws IOException {
        String url = buildUrl(searchRequest);
        String page = downloadWebPage(url);
        String previewUrl = new String();
        String trackName = new String();

        String[][] listTrack = new String[5][3];
        int number = 10;
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {

            listTrack[x][0] = getTag(page, "artistName", number);
            listTrack[x][1] = getTag(page, "trackName", number);
            listTrack[x][2] = getTag(page, "previewUrl", number);
            number += 500;
            System.out.println(x + ".  " + listTrack[x][0] + " - " + listTrack[x][1]);
        }

        System.out.println("Введите номер трека для прослушивания ");
        int track = scanner.nextInt();
        if (track==0){
           previewUrl = listTrack[0][2];
           trackName = listTrack[0][1];
        }
        if (track==1){
            previewUrl = listTrack[1][2];
            trackName = listTrack[1][1];
        }
        if (track==2){
            previewUrl = listTrack[2][2];
            trackName = listTrack[2][1];
        }
        if (track==3){
            previewUrl = listTrack[3][2];
            trackName = listTrack[3][1];
        }
        if (track==4){
            previewUrl = listTrack[4][2];
            trackName = listTrack[4][1];
        }


            try (InputStream in = new URL(previewUrl).openStream()) {
                Files.copy(in, Paths.get(trackName + ".m4a"));
            }

        System.out.println("Downloaded!");

        if (!Desktop.isDesktopSupported()) {
            System.out.println(" File opening not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        File file = new File(trackName + ".m4a");
        desktop.open(file);


    }

    private String getTag(String page, String tagName, int number) {

        int start = page.indexOf(tagName, number);
        start = start + tagName.length() + 3;
        int end = page.indexOf("\"", start);
        String value = page.substring(start, end);
        return value;
    }


    private String buildUrl(String searchRequest) {
        String term = searchRequest.replaceAll(" ", "+");  //
        String itunesApi = "https://itunes.apple.com/search?term=";
        String limitParam = "&limit=5";
        String mediaParam = "&media=music";
        StringBuilder builder = new StringBuilder();
        builder.append(itunesApi).append(term).append(limitParam).append(mediaParam);
        return builder.toString();

    }

    static String downloadWebPage(String url) throws IOException {
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





