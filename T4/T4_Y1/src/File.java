public class File extends DirFile{
    double size;
    String fileType;

    void printFile (){
        printDirFile();
        System.out.println("Количество файлов = " + size + "Количество папок = " +fileType);
    }



}
