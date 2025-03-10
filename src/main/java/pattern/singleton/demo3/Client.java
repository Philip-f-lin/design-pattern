package pattern.singleton.demo3;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // 判斷兩次獲取到的 Singleton 物件是否為同一個
        System.out.println(instance1 == instance2);
    }
}
