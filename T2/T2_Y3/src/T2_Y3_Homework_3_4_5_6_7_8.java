// 3.Выведите буквы от а до я (подсказка: for (char letter=’а’; letter<=’я’; letter++) ).
// 4.Выведите десять букв в алфавите после буквы й.
// 5.Выведите десять букв в алфавите, идущие до буквы ю.
// 6.Выведите каждую вторую букву алфавита (а, в, д).
// 7.Выведите каждую третью букву латинского алфавита.
// 8.выведите греческий алфавит (коды с 945по 969) через запятую (α, β, ...).
public class T2_Y3_Homework_3_4_5_6_7_8 {
    public static void main(String[] args) {
        for (char letter = 'а'; letter <= 'я'; letter++){
            System.out.println(letter);                                                       // Вывод букв от а до я
        }
        System.out.println();
        char letter = 'й';
        for (int x = 1; x <= 10; x++){
            System.out.println(++letter);                                                    // Вывод десяти букв после й
        }
        System.out.println();
        letter = 'ю';
        for (int x = 10; x >= 1; x--){
            System.out.println(--letter);                                                   // Вывод десяти букв до ю
        }
        System.out.println();
        for (char leter = 'а'; leter < 'я'; leter = (char)(leter + 2)){
            System.out.print(leter);                                                     // Вывод каждой второй буквы алфавита

        }
        System.out.println();
        for (char leter = 'a'; leter < 'z'; leter = (char)(leter + 3)){
            System.out.print(leter);                                                       // Вывод каждой третей буквы латинского алфавита
        }
        System.out.println();
        for (int x = 945; x <= 969; x++ ){
            char leter = (char) x;
            System.out.print(leter + "," );                                                // Вывод гречиского алфавита через запятую
        }
    }
}
