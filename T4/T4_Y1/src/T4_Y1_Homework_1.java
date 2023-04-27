// 1.  Реализуйте классы с наследованием: директория, файл.
public class T4_Y1_Homework_1{
    public static void main(String[] args) {
        Dir dir = new Dir();
        dir.folder = 10;
        dir.file = 5;
        dir.attribute = "Только для чтения";
        dir.dateCreation = "01.12.2020";
        dir.location = "C:\"Dir";
        dir.printDir();
        File file = new File();
        file.printFile();


    }

}
