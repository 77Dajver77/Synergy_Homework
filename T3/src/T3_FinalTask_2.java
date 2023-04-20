import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class T3_FinalTask_2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writerSecond = new PrintWriter("F:\\Java\\Synergy_Homework\\T3\\src\\Game.txt");
        writerSecond.println("2");
        writerSecond.close();

    }

}
