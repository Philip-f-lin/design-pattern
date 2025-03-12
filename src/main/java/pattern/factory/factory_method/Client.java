package pattern.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        // 創建咖啡店物件
        CoffeeStore store = new CoffeeStore();
        // 創建工廠物件
        //CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);
        // 點咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
