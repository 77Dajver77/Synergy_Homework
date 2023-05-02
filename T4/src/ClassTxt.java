import java.io.IOException;

public class ClassTxt extends ClassBase {
    public static void getTxt() throws IOException {
        String pathFile = "F:\\Java\\Synergy_Homework\\T4\\src\\Calculator.txt";
        String[] calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
        writerFile(pathFile, calculator);
        enterData(pathFile);
        calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
        total(pathFile, calculator);
    }
    }
