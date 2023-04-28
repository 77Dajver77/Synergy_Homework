public class File extends DirFile{
    double size;
    String fileType;

    void printFile (){
        printDirFile();
        System.out.println("Количество файлов = " + size + "Количество папок = " +fileType);
    }
    File(double size, String fileType){
        super("real", "raed", "text", "text");
        this.size = size;
        this.fileType = fileType;
        System.out.println("Конструктор класса File");
    }



}
