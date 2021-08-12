public class Basket { //класс
    private String items = "";//переменная
    private int totalPrice = 0;
    private int limit;

    public Basket() { // Конструктор без параметра
        items = "Order list:";
        this.limit = 1000000;
    }

    public Basket(int limit) { //конструктор с 1-м параметром
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) { //метод добавления в корзину с 2-я параметрами (переменные)
        if(contains(name)){
            return;
        }
        if(totalPrice + price >= limit){
            return;
        }

        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice + price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice () {
        return totalPrice;
    }

    public boolean contains(String name){ //РАЗОБРАТЬСЯ КАК РАБОТАЕТ!!!
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        }
        else {
            System.out.println(items);
        }
    }


}
