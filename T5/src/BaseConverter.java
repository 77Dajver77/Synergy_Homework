import java.util.Scanner;

//  Создайте конвертер температур. Для реализации данного технического задания напишите класс BaseConverter для конвертации из градусов по Цельсию в
//  Кельвины, Фаренгейты. У класса должен быть метод convert, который и делает конвертацию.
public class BaseConverter implements Converter {
    public static void main(String[] args) {
        System.out.println("Введите температуру в градусах Цельсия: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        Converter converter = new BaseConverter();
        converter.convert(value);
    }

    @Override
    public void convert(double value) {
        double kelvin = value + 273.15;
        double far = value * 1.8 + 32;
        System.out.println( "Температура в Кельвинах: " + kelvin);
        System.out.println("Температура в Фаренгейтах: " + far);
    }
}
