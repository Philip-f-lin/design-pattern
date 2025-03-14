package pattern.builder.demo1;

/**
 * ofo 腳踏車創建者，用來創建 ofo 腳踏車
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("鋁合金車架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡膠車座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
