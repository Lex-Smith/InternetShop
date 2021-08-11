public class Basket { //класс
    private static String items = "";//переменная
    private static int totalPrice = 0;

    public static void main(String[] args) { //метод
        add( "Колбаса", 76);
        add( "Молоко", 55);
        add("масло", 120);
        print("Содержимое корзмны:");
        System.out.println(getTotalPrice());
        clear();
        print("Содержимое корзмны:");
        System.out.println(getTotalPrice());
    }

    public static void add(String name, int price) { //метод добавления в корзину с 2-я параметрами (переменные)
        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice + price;
    }

    public static void clear() {
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice () {
        return totalPrice;
    }

    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        }
        else {
            System.out.println(items);
        }
    }


}
