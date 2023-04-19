// 1.Выведите числа от двух в десятой степени до десяти в четвертой степени.
public class T2_Y3_Homework_1 {
    public static void main(String[] args) {
        for (double x = Math.pow(2,10); x <= Math.pow(10,4); x++){
            System.out.println(x);
        }
    }
}
