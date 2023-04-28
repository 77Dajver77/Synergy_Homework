public class MainCharacter extends Heroes {
    String str;
    int age;
    void print(){

        System.out.println("Возраст: " + age + str);
    }
    MainCharacter(String str, int age){
        this.str = str;
        this.age = age;
        System.out.println("Конструктор класса MainCharacter");
    }
}
