package pattern.factory.factory_method;

/**
 * 拿鐵咖啡工廠物件，專門用來生產拿鐵咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
