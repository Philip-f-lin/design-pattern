package pattern.factory.abstract_factory;

/**
 * 咖啡
 */
public abstract class Coffee {

    public abstract String getName();

    // 加糖
    public void addSugar(){
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
