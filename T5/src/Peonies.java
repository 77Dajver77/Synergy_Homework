public class Peonies extends Flower {
    public int pricePeonies(int quantity ) {
        colFlower = colFlower + quantity;
        int sum = quantity * price;
        return sum;
    }
    public void printPeonies() {
        System.out.println("3 Peonies");
        System.out.println("Price: " + this.price);
        System.out.println("Made in: " + this.madeIn);
        System.out.println("Shelf life: " + this.shelfLife);
    }
}
