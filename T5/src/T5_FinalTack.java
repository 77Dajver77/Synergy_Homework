import java.util.Scanner;

public class T5_FinalTack {

    public static void main(String[] args) {

        Carnation carnation = new Carnation();
        carnation.initialization("Italy", 100, 10);
        Tulip tulip = new Tulip();
        tulip.initialization("Italy", 400, 10);
        Rose rose = new Rose();
        rose.initialization("Holland", 150, 15);
        Peonies peonies = new Peonies();
        peonies.initialization("Poland", 350, 5);
        Flower flower = new Flower();
        Scanner scanner = new Scanner(System.in);
        String[][] bouquet = new String[6][4];

        System.out.println("Собираем букет ");
        boolean flag = true;

        do {
            System.out.println("Выбирите цветок:");
            carnation.printCarnation();
            tulip.printTulip();
            rose.printRose();
            peonies.printPeonies();
            int choice = scanner.nextInt();
            System.out.println("Сколько цветов вы хотите купить?");
            int quantity = scanner.nextInt();

            switch (choice) {
                case (1):
                    bouquet[0][0] = "Carnation";
                    bouquet[1][0] = String.valueOf(carnation.priceCarnation(quantity));
                    break;
                case (2):
                    bouquet[0][0] = "Tulip";
                    bouquet[1][0] = String.valueOf(tulip.priceTulip(quantity));
                    break;
                case (3):
                    bouquet[0][0] = "Peonies";
                    bouquet[1][0] = String.valueOf(peonies.pricePeonies(quantity));
                    break;
                case (4):
                    bouquet[0][0] = "Rose";
                    bouquet[1][0] = String.valueOf(rose.priceRose(quantity));
                    break;
            }
            System.out.println("Будите еще выбирать цветок?  д/н");
            char c = scanner.next().charAt(0);
            if (c == 'д') {
                flag = true;
            } else {
                flag = false;
            }
        } while (true);


    }
}
