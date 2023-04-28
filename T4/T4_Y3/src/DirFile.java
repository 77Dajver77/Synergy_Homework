public class DirFile {
    String location;
    String attribute;
    String dateCreation;
    String name;

    void printDirFile(){
        System.out.println("Имя: "+ name +"Место расположения: " + location + "Атрибут: " + attribute + "Дата создания: " + dateCreation);
    }
    DirFile(String location, String attribute, String dateCreation, String name){
        this.location = location;
        this.attribute = attribute;
        this.dateCreation = dateCreation;
        this.name = name;
        File file = new File(12, "txt");
        Dir dir = new Dir();
    }


}
