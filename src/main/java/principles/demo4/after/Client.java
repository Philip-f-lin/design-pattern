package principles.demo4.after;

public class Client {
    public static void main(String[] args) {
        // 創建黑馬安全門物件
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        // 調用功能
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("==============");

        // 創建傳智安全門物件
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        // 調用功能
        door1.antiTheft();
        door1.fireProof();
    }

}
