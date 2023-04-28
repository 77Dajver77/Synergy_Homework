public class FriendCharacter extends Heroes {
    String str;
    String str2;

    void print() {
        System.out.println(str + str2);
    }

    FriendCharacter(String str, String str2) {

        this.str = str;
        this.str2 = str2;
        System.out.println("Конструктор класса FriendCharacter");}
}
