import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class WikiPage {
    String title = "https://ru.wikipedia.org/wiki/";

    WikiPage(String inputTitle) {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append(inputTitle);
        title = sb.toString();
    }

    public String toString() {
        String page = null;
        try {
            page = downoloadWebPAge(title);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return page;
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
