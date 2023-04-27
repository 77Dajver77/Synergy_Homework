public class Dir extends DirFile {
   int file;
   int folder;

void printDir (){
    printDirFile();
    System.out.println("Количество файлов = " + file + "Количество папок = " +folder);
}

}
