package pattern.factory.factory_method;

/**
 * CoffeeFactory，抽象工廠
 */
public interface CoffeeFactory {

    // 創建咖啡物件的方法
    Coffee createCoffee();
}
