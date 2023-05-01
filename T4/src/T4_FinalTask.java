//  Калькулятор расходов/доходов. Пользователь может ввести расход/доход: описание, сумму. В файл сохраняются эти поля + дата записи.
//  В конец файла сохраняется итог по месяцам.
//1.  Сделайте базовый класс, и реализации наследников:
//    на базе txt файла,
//    csv файла,
//    html файла.
//2.  Сделайте класс, который сможет интерактивно работать с этим файлом на базе любого наследника:
//    дать возможность ввести расход/доход,
//    посмотреть итог за выбранный месяц.
//3.  Сделайте класс, который дает открыть файл с помощью диалога, и в зависимости от типа файла, передает в работу нужного наследника.

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class T4_FinalTask {
    public static void main(String[] args) throws IOException {

        String[] calculator = getArrayCalculator(getStringNumber());
        for (int i = 0; i < calculator.length; i++) {
            writerFile("Calculator.txt", calculator[i]);
        }
        enterData("Calculator.txt");


    }

    private static void writerFile(String file, String string) {
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(string);
            bufferWriter.newLine();
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private static void writerFile_1(String file, String string) {
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(string+ "\n");
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private static int getTotal(String[] calculator) {
        int total = 0;
        for (int i = 0; i < calculator.length; i++) {
            String[] words = calculator[i].split(" ");
            if (words[0].equals("Расход")) {
                total -= Integer.parseInt(words[2]);
            } else total += Integer.parseInt(words[2]);
        }
        return total;
    }

    static String[] getArrayCalculator(int sum) {
        String[] calculator = new String[sum];
        try (BufferedReader reader = new BufferedReader(new FileReader("Calculator.txt"))) {
            int i = 0;
            while (i < calculator.length) {
                calculator[i] = reader.readLine();
                i++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return calculator;
    }

    static int getStringNumber() {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("Calculator.txt"))) {
            String string;
            while ((string = reader.readLine()) != null) {
                if (string.contains("Итого")) {
                    break;
                }
                sum++;
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return sum;
    }


    private static void enterData(String file) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char ch = 'н';
        do {
            StringBuilder sb = new StringBuilder();
            System.out.println("Введите расход/доход: ");
            sb.append(scanner.nextLine()).append(" ");
            System.out.println("Введите описание: ");
            sb.append(scanner.nextLine()).append(" ");
            System.out.println("Введите сумму: ");
            sb.append(scanner.nextLine()).append(" ").append(LocalDate.now());
            System.out.println("Продолжить д/н");
            ch = scanner.nextLine().charAt(0);
            if(ch == 'д') {
                sb.append("\n");
                writerFile_1(file, sb.toString());
            } else writerFile_1(file, sb.toString());

        } while (ch == 'д');


    }

}
