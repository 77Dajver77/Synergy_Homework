//3.  Реализуйте методы join(String s1, String s2), join(String s1, String s2, String s3),  .... join(String s1, String s2, String s3, String s4) -
//    которые склеивают строки.
public class T3_Y8_Homework_3 {
    public static void main(String[] args) {
        System.out.println(getJoin("Первая строка ", "Вторая строка"));
        System.out.println(getJoin("Первая строка ", "Вторая строка", " Третья строка"));
        System.out.println(getJoin("Первая строка ", "Вторая строка", " Третья строка", " Четвертая строка"));

    }
    static StringBuilder getJoin (String s1, String s2){
        StringBuilder builder = new StringBuilder();
        builder = builder.append(s1).append(s2);
        return builder;
    }
    static StringBuilder getJoin (String s1, String s2, String s3) {
        StringBuilder builder = new StringBuilder();
        builder = builder.append(s1).append(s2).append(s3);
        return builder;
    }
    static StringBuilder getJoin (String s1, String s2, String s3, String s4) {
        StringBuilder builder = new StringBuilder();
        builder = builder.append(s1).append(s2).append(s3).append(s4);
        return builder;
    }
}
