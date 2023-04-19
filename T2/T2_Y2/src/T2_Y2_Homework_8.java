//   8. Первый игрок сохраняет слово и подсказку в первый файл, второй игрок во
//      второй. Игра начинается, выводятся подсказки, игроки по - очереди
//      пытаются отгадать слово противника.


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class T2_Y2_Homework_8 {
    public static void main(String[] args) throws IOException {
        File fileFirstPlayer = new File( "Fist" );
        fileFirstPlayer.createNewFile();
        File fileSecondPlayer = new File( "Second" );
        fileSecondPlayer.createNewFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый игрок");
        System.out.println("Загадайте слово: ");
        String fistPlayerPuzzle = scanner.nextLine();
        System.out.println("Введите подсказку: ");
        String fistPlayerPrompt = scanner.nextLine();
        System.out.println("Второй игрок");
        System.out.println("Загадайте слово: ");
        String secondPlayerPuzzle = scanner.nextLine();
        System.out.println("Введите подсказку: ");
        String secondPlayerPrompt = scanner.nextLine();
        PrintWriter writerFist = new PrintWriter("Fist");
        writerFist.println(fistPlayerPuzzle);
        writerFist.println(fistPlayerPrompt);
        writerFist.close();
        PrintWriter writerSecond = new PrintWriter("Second");
        writerSecond.println(secondPlayerPuzzle);
        writerSecond.println(secondPlayerPrompt);
        writerSecond.close();
        System.out.println("Подсказка для первого игрока " + secondPlayerPrompt);
        System.out.println("Подсказка для второго игрока " + fistPlayerPrompt);
        System.out.println("Первый игрок введите ответ: ");
        String fistAnswer = scanner.nextLine();
        System.out.println("Второй игрок введите ответ: ");
        String secondAnswer = scanner.nextLine();
        if ((fistPlayerPuzzle.equals(secondAnswer)) && (secondPlayerPuzzle.equals(fistAnswer))) {
            System.out.println("Ничья");
        } else if (fistPlayerPuzzle.equals(secondAnswer)) {
            System.out.println("Победил второй игрок");
        } else if (secondPlayerPuzzle.equals(fistAnswer)) {
            System.out.println("Победил первый игрок");
        } else System.out.println("Неугодали");
        while ((!fistPlayerPuzzle.equals(secondAnswer)) && (!secondPlayerPuzzle.equals(fistAnswer))) {
            System.out.println("Первый игрок введите ответ: ");
            fistAnswer = scanner.nextLine();
            System.out.println("Второй игрок введите ответ: ");
            secondAnswer = scanner.nextLine();
            if ((fistPlayerPuzzle.equals(secondAnswer)) && (secondPlayerPuzzle.equals(fistAnswer))) {
                System.out.println("Ничья");
            } else if (fistPlayerPuzzle.equals(secondAnswer)) {
                System.out.println("Победил второй игрок");
            } else if (secondPlayerPuzzle.equals(fistAnswer)) {
                System.out.println("Победил первый игрок");
            } else System.out.println("Неугодали");
        }
    }
}
