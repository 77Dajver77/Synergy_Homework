

import java.awt.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ClassBase {


//        String pathFile = "F:\\Java\\Synergy_Homework\\T4\\src\\Calculator.txt";
//        String[] calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
//        writerFile(pathFile, calculator);
//        enterData(pathFile);
//        calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
//        total(pathFile, calculator);


public void openFile(File file){

    Desktop desktop = Desktop.getDesktop();
    try {
        desktop.open(file);
    }catch (IOException e){
        throw new RuntimeException("Error", e);
    }
}

    static void writerFile(String file, String[] calculator) {
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (int i = 0; i < calculator.length; i++) {
                bufferWriter.write(calculator[i]);
                if (i+1 <calculator.length) bufferWriter.newLine();
            }
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    static void writerFile_1(String file, String string) {
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.newLine();
            bufferWriter.write(string);
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    static void total (String pathFile, String[] calculator) {
        int total = 0;
        for (int i = 0; i < calculator.length; i++) {
            String[] words = calculator[i].split(" ");
            if (words[0].equals("Расход")) {
                total -= Integer.parseInt(words[2]);
            } else total += Integer.parseInt(words[2]);
        }
        writerFile_1(pathFile, "Итого: "+ String.valueOf(total));
    }

    static String[] getArrayCalculator(int sum, String pathFile) {
        String[] calculator = new String[sum];
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
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

    static int getStringNumber(String pathFile) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
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


    static void enterData(String file) throws IOException {
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
            writerFile_1(file, sb.toString());

        } while (ch == 'д');


    }

}
