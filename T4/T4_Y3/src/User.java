public class User extends UsAdMo  {
    String firm;

    void print(){
        System.out.println("Фирма: " + firm);
    }

    User(String firm){
        System.out.println("Конструктор класса User");
    }
}

