package pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        // 1. 創建咖啡店類
        CoffeeStore coffeeStore = new CoffeeStore();
        // 2. 點咖啡
        Coffee coffee = coffeeStore.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}
