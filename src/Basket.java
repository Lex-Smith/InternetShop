public class Basket { //класс
    private static String items = "";//??? скорее всего переменная

    public static void main(String[] args) { //метод
        add( "Колбаса", 76);
        add( "Молоко", 55);
        add("масло", 120);
        print("Содержимое корзмны:");
        clear();
        print("Содержимое корзмны:");
    }

    public static void add(String name, int price) { //метод добавления в корзину с 2-я параметрами (переменные)
        items = items + "\n" + name + " - " + price;
    }

    public static void clear() {
        items = "";
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
