package pattern.facade;

public class Client {
    public static void main(String[] args) {
        // 創建智能音箱物件
        SmartAppliancesFacade facade = new SmartAppliancesFacade();

        // 控制家電
        facade.say("打開家電");

        System.out.println("===============");

        facade.say("關閉家電");
    }
}
