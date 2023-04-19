// Вывести числа от 50 до 100
// Вывести числа от 100 до 1
//  Вывести числа от 0 до - 100
public class T1_Y2_Homework_9_10_11 {
    public static void main(String[] args) {
        int x = 50, y = 100, z = 0;
        while (x <=100) {
            System.out.print (x++ +" ");
        }
        System.out.println();
        while (y>=0) {
            System.out.print(y-- +" ");
        }
        System.out.println();
        while (z>= -100) {
            System.out.print(z-- +" ");
        }
    }
}
