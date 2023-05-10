//1.  Сделайте интерфейс Decoder. В нем два метода String encode(String source) и String decode(String encoded).
//    Реализуйте этот интерфейс: пусть класс меняет русские символы на цифры и латиницу (ш на w, г на r и так далее), и наоборот.
//2.  Сделайте ещё одну реализацию Decoder: он будет шифровать и дешифровать азбуку морзе.
//3.  Еще одну реализацию: он будет менять символ на код символа ( который можно получить как (int)str.charAt ).
//4.  Доработать ConsoleTableWriter, чтобы длина левой колонки была одинаковой для всех строк и равна длине самой большой.

import java.util.Scanner;

public class T5_Y1_Homework_1 {
    public static void main(String[] args) {
     DecodeEncode decodeEncode = new DecodeEncode();
     Azbyka azbyka = new Azbyka();
     DecoderChar decoderChar = new DecoderChar();
        System.out.println("Введите строку для кодирования: ");
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        System.out.println(decodeEncode.encode(source));
        System.out.println(azbyka.encode(source));
        System.out.println("Введите строку для декодирования на латинице: ");
        source = scanner.nextLine();
        System.out.println(decodeEncode.decode(source));
        System.out.println("Введите строку для декодирования на азбуке Морзе: ");
        source = scanner.nextLine();
        System.out.println(azbyka.decode(source));
        decoderChar.encode("g");


    }
}
