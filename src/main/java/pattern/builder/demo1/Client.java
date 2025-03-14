package pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        // 創建指揮者物件
        Director director = new Director(new MobileBuilder());
        // 指揮者指揮組裝腳踏車
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
