//1.  Выбросите NPE.
//2.  Напишите код, в котором будет выброшен нпе, при этом не используется throw.
//3.  Как уберечься от nullов. -  Добавить условие на проверку null (if).
//4.  Что такое null? - пустота, значение обьектов по умолчанию, если поле не инециализировано.

public class T4_Y10_Homework_1_2_3_4 {
    public static void main(String[] args) {
        Default example = new Default();
        try {
            example.cat.method();
        } catch (Exception e) {
            System.out.println("NPE");
        }
        example.cat.method();
    }

    }

