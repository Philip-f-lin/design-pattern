package pattern.singleton.demo2;

/**
 * 餓漢式：靜態代碼塊
 */
public class Singleton {

    // 1. 創建私有構造方法
    private Singleton(){}

    // 2. 聲明 Singleton 類型的變量
    private static Singleton instance; // null

    // 3. 在靜態代碼塊中進行賦值
    static {
        instance = new Singleton();
    }

    // 4. 對外提供獲取該類的方法
    public static Singleton getInstance(){
        return instance;
    }
}
