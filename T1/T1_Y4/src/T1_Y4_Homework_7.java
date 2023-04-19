import java.util.Scanner;

// 7. Придумайте способ переводить из int в boolean и наоборот.
public class T1_Y4_Homework_7 {
    public static void main(String[] args) {
        boolean numBoolean;
        Scanner num = new Scanner(System.in);
        System.out.print("Введите переменнную типа int: ");
        int numInt = num.nextInt();
      if (numInt > 0) {                                       // Перевод int в boolean
          numBoolean = true;
        } else {
          numBoolean = false;
        }
        System.out.println("int = " + numInt + " boolean = " + numBoolean);

      System.out.print("Введите переменную типа boolean true/false: ");      // Перевод boolean в int
      numBoolean = num.nextBoolean();

      if (numBoolean) {
          numInt = 1;
      } else {
          numInt = 0;
        }
        System.out.println("boolean = " + numBoolean + " int = " + numInt);
  }
}
