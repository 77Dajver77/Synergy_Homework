import java.util.Scanner;

public class T1_Y4_Homework_1_2_3_4_5_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);                   // 1.Составьте программу, которая переводит переменную из byte в short
        System.out.print("Введите значение переменной типа byte: ");
        byte numByte = num.nextByte();
        short numShort = numByte;
        System.out.println("byte = " + numByte + "   short = " + numShort);

        System.out.print("Введите значение переменной типа short: ");          //2. Составьте программу, которая переводит переменную из short в int
        numShort = num.nextShort();
        int numInt = numShort;
        System.out.println("short = " + numShort + " int = " + numInt);

        System.out.print("Введите значение переменной типа int: ");      // 3. Составьте программу, которая переводит переменную из int в long
        numInt = num.nextInt();
        long numLong = numInt;
        System.out.println("int = " + numInt + " long = " + numLong);

        System.out.print("Введите значение переменной типа long: ");   // 4. Составьте программу, которая переводит переменную из long в int
        numLong = num.nextLong();
        numInt = (int) numLong;
        System.out.println("long = " + numLong + " int = " + numInt);

        System.out.print("Введите значение переменной типа float: ");   // 5. Составьте программу, которая переводит переменную из float в double
        float numFloat = num.nextFloat();
        double numDouble = numFloat;
        System.out.println("float = " + numFloat + " double = " + numDouble);

        System.out.print("Введите значение переменной типа double: ");  // 6. Составьте программу, которая переводит переменную из double в float
        numDouble = num.nextDouble();
        numFloat = (float) numDouble;
        System.out.println("double = " + numDouble + " float = " + numFloat);









    }
}
