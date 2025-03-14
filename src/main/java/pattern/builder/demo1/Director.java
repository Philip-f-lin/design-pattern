package pattern.builder.demo1;

/**
 * 指揮者類
 */
public class Director {

    // 聲明 builder 類型的變量
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
