// Если 5 в 15 степени больше миллиарда, вывести «Степень это мощь. Poweris a power.»
public class T1_Y2_Homework_1 {
    public static void main(String[] args) {
        double x = Math.pow(5,15);
       if (x>1000000000) {
        System.out.println("Степень это мощь. Power is a power.");
       }
        if (Math.pow(5,15)>1000000000) {
            System.out.println("Степень это мощь. Power is a power.");
        }
    }
}
