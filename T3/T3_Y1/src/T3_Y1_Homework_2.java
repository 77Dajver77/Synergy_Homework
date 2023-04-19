// 2. Создайте классы для описания операционных систем.

import java.util.Scanner;

public class T3_Y1_Homework_2 {
    public static void main(String[] args) {
        Os operatingSystem = new Os();
        System.out.println("Введите название операционной системы: ");
        Scanner scanner = new Scanner(System.in);
        operatingSystem.nameOC = scanner.next();
        System.out.println("Введите тип операционной системы: ");
        operatingSystem.typeOC = scanner.next();
        System.out.println("Название операционной системы " + operatingSystem.nameOC + " тип "+ operatingSystem.typeOC);
    }


}
