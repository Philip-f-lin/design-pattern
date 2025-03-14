package pattern.builder.demo1;

/**
 * 具體的創建者，用來創建腳踏車物件
 */
public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("碳纖維車架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮車座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
