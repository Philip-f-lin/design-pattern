package pattern.singleton.demo2;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // 判斷兩次獲取到的 Singleton 物件是否相同
        System.out.println(instance1 == instance2);
    }
}
