import java.util.Scanner;

// 3. Поиск максимального числа из 3 введенных
public class T1_Y8_Homework_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int max = (x>y && x>z) ? x : (y>z && y>x) ? y : z;
        System.out.println(max);

    }
}
