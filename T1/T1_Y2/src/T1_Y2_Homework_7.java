// Задать две переменных - икс и игрек. Вывести, что больше - икс в степени игрек, или наоборот.
public class T1_Y2_Homework_7 {
    public static void main(String[] args) {
        double икс = 13;
        double игрек = 23;
        if (Math.pow(икс, игрек) > Math.pow(игрек, икс)) {
            System.out.println("икс в степени игрек больше чем игрек в степени икс");
        }
        if (Math.pow(игрек, икс) > Math.pow(икс, игрек)) {
            System.out.println("игрек в степени икс больше чем икс в степени игрек");
        }
    }
}
