package pattern.factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        // 聲明 Coffee 類型的變量，根據不同類型創建不同的 Coffee 子類物件
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("沒有這個咖啡");
        }
        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
