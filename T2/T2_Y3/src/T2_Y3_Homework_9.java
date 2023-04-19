// 9.Выведите в файл list.html список :
// <ul>
// <li> 1 element </li>
// <li> 2 element </li>...<li> 100 element </li></ul>

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class T2_Y3_Homework_9 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writerList = new PrintWriter("list.html");                             // Записать в файл
        writerList.println("<ul>");
        for (int x = 1; x <= 100; x++){
            writerList.println("<li> " + x + "element </li>");
        }
        writerList.println("</ul>");
        writerList.close();
    }
}
