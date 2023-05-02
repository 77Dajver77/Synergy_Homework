import java.io.IOException;

public class ClassCsv extends ClassBase {

        public static void getCsv() throws IOException {
                String pathFile = "F:\\Java\\Synergy_Homework\\T4\\src\\Calculator.cvs";
                String[] calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
                writerFile(pathFile, calculator);
                enterData(pathFile);
                calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
                total(pathFile, calculator);
        }
}
