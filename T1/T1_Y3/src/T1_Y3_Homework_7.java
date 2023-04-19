// 7. Пройдите в дебаге программу. Сколько раз вызывается метод str.length()?
public class T1_Y3_Homework_7 {
    public static void main(String[] args) {
        String str = "Hell";
        while (str.length() < 10) {
            str = str + "0";
        }

    }
}
// Метод  str.length() вызывается 7 раз.