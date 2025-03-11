package pattern.singleton.demo4;

/**
 * 雙重檢查鎖方式
 */
public class Singleton {

    // 私有構造方法
    private Singleton(){}

    // 聲明 Singleton 類型變量
    private static volatile Singleton instance;

    // 對外提供公共的訪問方式
    public static Singleton getInstance(){
        // 第一次判斷，如果 instance 的值不為 null，不需要搶佔鎖，直接返回物件
        if (instance == null){
            synchronized (Singleton.class){
                // 第二次判斷
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
