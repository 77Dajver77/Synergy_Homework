public class Rose extends Flower {

    public int priceRose (int quantity ) {
        colFlower = colFlower + quantity;
        int sum = quantity * price;
        return sum;
    }
    public void printRose() {
        System.out.println("4 Rose");
        System.out.println("Price: " + this.price);
        System.out.println("Made in: " + this.madeIn);
        System.out.println("Shelf life: " + this.shelfLife);
    }

}





