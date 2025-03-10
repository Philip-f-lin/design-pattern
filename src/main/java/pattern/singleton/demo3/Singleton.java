package pattern.singleton.demo3;

/**
 * 懶漢式
 */
public class Singleton {

    // 私有構造方法
    private Singleton(){}

    // 聲明 Singleton 類型的變量 instance
    private static Singleton instance; // 只是聲明變量，沒有進行賦值

    // 對外提供訪問方式
    public static synchronized Singleton getInstance(){
        // 判斷 instance 是否為 null，如果為 null，說明還沒有創建 Singleton 類的物件
        // 如果沒有，創建一個並返回，如果有，直接返回
        if (instance == null){
            // 線程 1 等待，線程 2 獲取到 cpu 的執行權，也會進到該判斷裡面（如果沒有加 synchronized）
            instance = new Singleton();
        }
        return instance;
    }


}
