// Медиабраузер. Пользователь вводит слово(слова) из названия песни/фильма, в iTunes API ищутся по этому названию варианты песен/фильмов
// и предлагаются пользователю. Пользователь выбирает, какую песню/трейлер скачать, файл скачивается и воспроизводится.


import java.io.IOException;
import java.util.Scanner;

public class T3_FinalTask_2 {
    public static void main(String[] args) throws IOException {
        ITunesMusicPlayer player = new ITunesMusicPlayer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which song you are looking for?");
        String name =scanner.nextLine();
        player.playSong(name);









    }

}
