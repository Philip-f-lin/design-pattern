package pattern.factory.factory_method;


public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    // 點咖啡功能
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
