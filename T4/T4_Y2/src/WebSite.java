public class WebSite {
    String name;
    String path;

    WebSite() {
        this.name = "Синергия";
        this.path = "https://lms.synergy.ru";

        System.out.println("Название веб-сайта: " + name + "  Путь к веб-сайту: " + path);
    }
    WebSite(String name, String path) {

        System.out.println("Название веб-сайта: " + name + " Путь к веб-сайту: " + path);
    }

}
