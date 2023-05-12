public class ITunesSong {
    String artistName;
    String trackName;
    String collectionName;
    String previewUrl;
    String trackCensoredName;
    double collectionPrice;
    double trackPrice;
    void printIntroducePreview() {
        System.out.println(this.artistName + " - " + this.collectionName);
        System.out.println("url to preview: " + this.previewUrl);
    }
}
