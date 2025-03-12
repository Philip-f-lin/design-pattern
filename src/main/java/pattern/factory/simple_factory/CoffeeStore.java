package pattern.factory.simple_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String type){

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 調用生產咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
