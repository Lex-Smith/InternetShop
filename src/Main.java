public class Main {
    public static void main(String[] args) { //метод
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Milk", 80);
        vasyaBasket.add("Bread", 40);

        Basket petyaBasket = new Basket();
        petyaBasket.add("Shovel", 280);
        petyaBasket.add("Barrel", 2900);

        vasyaBasket.print("Vasya Basket");
        petyaBasket.print("Petya Basket");

    }
}
