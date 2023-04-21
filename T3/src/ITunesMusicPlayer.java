import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ITunesMusicPlayer {
    void playSong(String searchRequest) throws IOException {
        String url = buildUrl(searchRequest);
        String page = downloadWebPage(url);
       // System.out.println(url);
       System.out.println(page);

    }

    private String buildUrl(String searchRequest) {
        String term = searchRequest.replaceAll(" ", "+");
        String itunesApi = "https://itunes.apple.com/search?term=";
        String limitParam = "&limit=1";
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





