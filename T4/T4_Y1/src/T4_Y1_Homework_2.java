//2. Реализуйте классы с наследованием: пользователь, администратор, модератор.

public class T4_Y1_Homework_2 {
    public static void main(String[] args) {
        User user = new User();
        user.rights = "Разрешения: Только для чтения";
        user.name = "Иван";
        user.firm = "ООО Рога и копыта";
        user.print();
        Admin admin = new Admin();
        admin.rights = "Разрешения: полный доступ";
        admin.name = "Василий";
        Moderator moderator = new Moderator();
        moderator.rights = "Разрешения: запись и чтение";
        moderator.name = "Иван";
        moderator.forum = "Форум";
        moderator.print();
    }
}
