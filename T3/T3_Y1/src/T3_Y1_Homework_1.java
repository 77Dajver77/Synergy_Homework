// 1.Создайте классы с полями для описания структуры университета.
//   Комбинируйте! Пусть одни классы будут полями других.

import java.util.Scanner;

public class T3_Y1_Homework_1 {
    public static void main(String[] args) {
        Full_Name student = new Full_Name();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите имя студента: ");
        student.name = scanner.next();
        System.out.println(" Введите фамилию студента: ");
        student.surName = scanner.next();
        System.out.println("Введите отчество студента: ");
        student.secondName = scanner.next();
        System.out.println("ФИО студента: " + student.surName + " " + student.name + " " + student.secondName);
        System.out.println("Введите название кафедры экономического факультета:");
        student.faculty.economy = scanner.next();
    }
}
