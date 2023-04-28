public class Dir extends DirFile {
   int file;
   int folder;

void printDir (){
    printDirFile();
    System.out.println("Количество файлов = " + file + "Количество папок = " +folder);
}
    Dir(){
        super("real", "raed", "text", "text");

    System.out.println("Конструктор класса Dir");
}

}
