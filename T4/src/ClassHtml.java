import java.io.IOException;

public class ClassHtml extends ClassBase {
        public static void getHtml() throws IOException {
                String pathFile = "F:\\Java\\Synergy_Homework\\T4\\src\\Calculator.html";
                String[] calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
                writerFile(pathFile, calculator);
                enterData(pathFile);
                calculator = getArrayCalculator(getStringNumber(pathFile), pathFile);
                total(pathFile, calculator);
        }

}
