package pattern.facade;

/**
 * 外觀類，使用者主要和外觀類進行交互
 */
public class SmartAppliancesFacade {

    // 聚合電視、電燈、冷氣物件
    private AirCondition airCondition;
    private Light light;
    private TV tv;

    public SmartAppliancesFacade(){
        airCondition = new AirCondition();
        light = new Light();
        tv = new TV();
    }

    // 透過語音控制
    public void say(String message){
        if (message.contains("打開")){
            on();
        } else if (message.contains("關閉")) {
            off();
        }else {
            System.out.println("我聽不懂你說的");
        }
    }

    // 一鍵打開
    private void on(){
        airCondition.on();
        light.on();
        tv.on();
    }

    // 一鍵關閉
    private void off(){
        airCondition.off();
        light.off();
        tv.off();
    }
}
