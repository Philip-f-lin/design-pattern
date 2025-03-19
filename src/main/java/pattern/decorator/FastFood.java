package pattern.decorator;

/**
 * 速食類（抽象構建角色）(Component)
 */
public abstract class FastFood {

    private float price; // 價格

    private String desc; // 描述

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
