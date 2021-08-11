public class Basket { //класс
    private static String items = "";//переменная
    private static int totalPrice = 0;

    public static void main(String[] args) { //метод
        add( "Колбаса", 76);
        add( "Молоко", 55);
        add("масло", 120);
        print("Содержимое корзмны:");
        int totalPrice = getTotalPrice();
        System.out.println("Общая стоимость товаров: " + totalPrice);
        clear();
        System.out.println();
        print("Содержимое корзмны:");
        totalPrice = getTotalPrice();
        System.out.println("Общая стоимость товаров: " + totalPrice);
    }

    public static void add(String name, int price) { //метод добавления в корзину с 2-я параметрами (переменные)
        if(contains(name)){
            return;
        }
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

    public static boolean contains(String name){ //РАЗОБРАТЬСЯ КАК РАБОТАЕТ!!!
        return items.contains(name);
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
