package pattern.singleton.demo1;

public class Client {
    public static void main(String[] args) {
        // 創建 Singleton 物件
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        // 判斷兩個物件是否相同
        System.out.println(instance1 == instance2);
    }
}
