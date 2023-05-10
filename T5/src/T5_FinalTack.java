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
        String[][] bouquet = new String[9][4];
        inizializationBouquet(bouquet);

        for (int i = 0; i < 9; i = i + 3) {
            System.out.println("Собираем букет " );
            boolean flag = true;
            int numberFlower = 0;

            do {
                System.out.println("Выбирите цветок:");
                carnation.printCarnation();
                tulip.printTulip();
                peonies.printPeonies();
                rose.printRose();
                int choice = scanner.nextInt();
                System.out.println("Сколько цветов вы хотите купить?");
                int quantity = scanner.nextInt();

                switch (choice) {
                    case (1):
                        bouquet[i][numberFlower] = "Carnation";
                        bouquet[i + 1][numberFlower] = String.valueOf(quantity);
                        bouquet[i + 2][numberFlower] = String.valueOf(carnation.priceCarnation(quantity));
                        break;
                    case (2):
                        bouquet[i][numberFlower] = "Tulip";
                        bouquet[i + 1][numberFlower] = String.valueOf(quantity);
                        bouquet[i + 2][numberFlower] = String.valueOf(tulip.priceTulip(quantity));
                        break;
                    case (3):
                        bouquet[i][numberFlower] = "Peonies";
                        bouquet[i + 1][numberFlower] = String.valueOf(quantity);
                        bouquet[i + 2][numberFlower] = String.valueOf(peonies.pricePeonies(quantity));
                        break;

                    case (4):
                        bouquet[i][numberFlower] = "Rose";
                        bouquet[i + 1][numberFlower] = String.valueOf(quantity);
                        bouquet[i + 2][numberFlower] = String.valueOf(rose.priceRose(quantity));
                        break;
                }
                System.out.println("Будите еще выбирать цветок?  д/н");
                char c = scanner.next().charAt(0);
                if (c == 'д') {
                    flag = true;
                } else {
                    flag = false;
                }
                numberFlower++;
            } while (flag && numberFlower <= 3);
            System.out.println("Ваш букет готов");
        }
        for (int i = 0; i < 9; i=i+3) {
            System.out.println("Ваш букет: ");
            int priceBouquet = 0;
            for (int j = 0; j < 4; j++) {
                if (!bouquet[i][j].equals("0"))
                System.out.print(bouquet[i][j] + "  " + bouquet[i + 1][j] + "   шт.  ");
                priceBouquet += Integer.parseInt(bouquet[i + 2][j]);
            }
            System.out.println();
            System.out.println("Сумма: " + priceBouquet);

    }
        System.out.println("Всего продано цвето: " + Flower.colFlower);
    }

    private static void inizializationBouquet(String[][] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            for (int j = 0; j < bouquet[i].length; j++) {
                bouquet[i][j] = String.valueOf(0);
            }
        }
    }
}
