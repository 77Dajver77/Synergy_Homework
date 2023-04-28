public class UsAdMo {
    String rights;
    String name;

    void print() {
        System.out.println("Разрешения: " + rights + "Имя: " + name);
    }

    Admin admin = new Admin("Windows");
    User user = new User("Microsoft");
    Moderator moderator = new Moderator("Google");
}