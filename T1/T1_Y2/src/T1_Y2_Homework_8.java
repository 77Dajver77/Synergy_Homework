// Вывести числа от 1 до 100
public class T1_Y2_Homework_8 {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 100) {
            System.out.print(x + " " );
            x = x + 1;
        }
        System.out.println();
        x = -1;
        while (x <= 99) {
            System.out.print(++x + " " );

        }
        System.out.println();
        x = 0;
        while (x <= 100) {
            System.out.print(x++ +" ");
        }
    }

}
