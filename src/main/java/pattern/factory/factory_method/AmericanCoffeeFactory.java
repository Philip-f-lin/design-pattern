package pattern.factory.factory_method;

/**
 * 美式咖啡工廠物件，專門用來生產美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
