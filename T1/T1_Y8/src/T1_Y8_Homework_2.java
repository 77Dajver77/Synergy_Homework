// Написать код короче, использую тернарный оператор.
import java.util.Scanner;

public class T1_Y8_Homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String str = x > y ? ">" : "<=";;
        System.out.println("икс " + str + " игрек");
    }
}
