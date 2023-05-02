//    Калькулятор расходов/доходов. Пользователь может ввести расход/доход: описание, сумму. В файл сохраняются эти поля + дата записи.
//    В конец файла сохраняется итог по месяцам.
//1.  Сделайте базовый класс, и реализации наследников:
//    на базе txt файла,
//    csv файла,
//    html файла.
//2.  Сделайте класс, который сможет интерактивно работать с этим файлом на базе любого наследника:
//    дать возможность ввести расход/доход,
//    посмотреть итог за выбранный месяц.
//3.  Сделайте класс, который дает открыть файл с помощью диалога, и в зависимости от типа файла, передает в работу нужного наследника.





import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class T4_FinalTask {
    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showDialog(null, null);
        File file = fileChooser.getSelectedFile();
        String nameFile = file.getName();
        ClassBase openFile = new ClassBase();
        if (nameFile.contains("txt")){
            openFile.openFile(file);
            ClassTxt txt = new ClassTxt();
            txt.getTxt();
            openFile.openFile(file);
        }
        if (nameFile.contains("html")){
            openFile.openFile(file);
            ClassHtml html = new ClassHtml();
            html.getHtml();
            openFile.openFile(file);
        }
        if (nameFile.contains("cvs")){
            openFile.openFile(file);
            ClassCsv Csv = new ClassCsv();
            Csv.getCsv();
            openFile.openFile(file);
        }




    }
}
