package pattern.factory.abstract_factory;

public interface DessertFactory {

    // 生產咖啡的功能
    Coffee createCoffee();

    // 生產甜點的功能
    Dessert createDessert();
}
