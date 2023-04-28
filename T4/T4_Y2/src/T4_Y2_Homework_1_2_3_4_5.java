//1.  Что такое конструктор по - умолчанию?   -  это конструктор, который не имеет параметров.
//2.  Как сделать так, чтобы при каждом создании экземпляра класса, в консоль что - то выводилось? (Слежка за классом :).
//3.  Сделайте класс, отображающий операционную систему; сделайте конструктор для него. Создайте несколько экземпляров.
//4.  Сделайте класс WebSite, и несколько конструкторов для него; продемонстрируйте использование.
//5.  Создайте экземпляры StringBuilder, используя несколько конструкторов.

public class T4_Y2_Homework_1_2_3_4_5 {
    public static void main(String[] args) {
        OC oc = new OC("Windows", "64-bit");
        OC os = new OC("Linux", "32-bit");
        WebSite ws = new WebSite();
        WebSite ws1 = new WebSite("Синергия", "https://lms.synergy.ru");

        String s = "Синергия";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("Синергия");
        System.out.println(sb1);


    }
}
