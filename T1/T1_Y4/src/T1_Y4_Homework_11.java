/* 11. Пусть int равен от 30 до 150. Переведите каждый int в char, и выведите
        таблицу, где на каждой строчке есть int и соответствующий ему char */

public class T1_Y4_Homework_11 {
    public static void main(String[] args) {
        int numInt = 30;
        char ch;
        while ( numInt < 151 ) {
            ch = (char) numInt;
            System.out.println("int = " + numInt + "   ch: " + ch);
            numInt ++;
        }
    }
}
