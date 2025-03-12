package pattern.factory.static_factory;


/**
 * 簡單咖啡工廠類，用來生產咖啡
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type){
        // 聲明 Coffee 類型的變量，根據不同類型創建不同的 Coffee 子類物件
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("沒有這個咖啡");
        }

        return coffee;
    }
}
