//5.  Выводите числа от 1 до того момента, как сумма всех цифр в числе не будет равна 20 (пример такого числа -875).
//6.  Выведите все даты невисокосного года. В январе 31 день, феврале -28, далее чередуется -в марте 31, в апреле 30...
public class T3_Y6_Homework_5_6 {
    public static void main(String[] args) {
        int y = 0;
        int z = 0;
        int sum = 0;
        for (int x = 1; x < 11; x++) {
            if (sum == 20) break;
            if (x > 9) {
                x = 0;
                y++;
            }
            if (y > 9) {
                y = 0;
                z++;
            }
            sum = x + z + y;
            if ((y > 0) && (z == 0)) {
                System.out.print(y);
                System.out.println(x);
            }
            if (z > 0) {
                System.out.print(z);
                System.out.print(y);
                System.out.println(x);
            }
            if ((z == 0) && (y == 0)) {
                System.out.println(x);
            }
        }


    }
}
