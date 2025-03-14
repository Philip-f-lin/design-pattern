package pattern.builder.demo1;

public abstract class Builder {

    // 聲明 Bike 類型的變量，並進行賦值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    // 創建腳踏車的方法
    public abstract Bike createBike();
}
