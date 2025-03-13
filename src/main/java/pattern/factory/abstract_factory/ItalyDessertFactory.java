package pattern.factory.abstract_factory;

/**
 * 義大利口味甜點工廠，生產拿鐵及提拉米蘇
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
