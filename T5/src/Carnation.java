public class Carnation extends Flower {

    public int priceCarnation (int quantity)  {
        int sum = quantity * price;
        colFlower = colFlower + quantity;
        return sum;
    }
    public void printCarnation() {
        System.out.println("1 Carnation");
        System.out.println("Price: " + this.price);
        System.out.println("Made in: " + this.madeIn);
        System.out.println("Shelf life: " + this.shelfLife);


    }


}

