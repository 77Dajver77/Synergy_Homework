public class Tulip extends Flower {
    public int priceTulip (int quantity ) {
        bouquet = bouquet + quantity;
       int sum = quantity * price;
        return sum;
    }
    public void printTulip() {
        System.out.println("2 Tulip");
        System.out.println("Price: " + this.price);
        System.out.println("Made in: " + this.madeIn);
        System.out.println("Shelf life: " + this.shelfLife);
    }
}
