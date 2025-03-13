package pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        // 創建義大利口味甜點工廠物件
        //ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        // 獲取拿鐵及提拉米蘇
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
