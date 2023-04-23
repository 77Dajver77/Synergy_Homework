//1.  Реализуйте метод, который находит из трех чисел то, которое делится на 2 остальных; или возвращает - 1, если такого нет.

import java.util.Scanner;

public class T3_Y7_Homework_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье  число: ");
        int thirdNumber = scanner.nextInt();
        if (getNumber(firstNumber,secondNumber,thirdNumber) > 0 ) {
            System.out.println("Число " + getNumber(firstNumber,secondNumber,thirdNumber) + " делится  на два остальных" );
        }else System.out.println("Нет искомого числа");

    }
    static int getNumber(int first, int second, int third){
        int number = 0;
        if((first%second ==0) && (first%third ==0)){
            number = first;
        }
        if((second%first ==0) && (second%third ==0)){
            number = second;
        }
        if((third%first ==0) && (third%second==0)){
            number = third;
        }
        if (number ==0) number=-1;
       return  number;
    }
}

