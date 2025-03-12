package pattern.factory.simple_factory;

public class Client {
    public static void main(String[] args) {
        // 創建咖啡店類物件
        CoffeeStore store = new CoffeeStore();
        // 點咖啡
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
