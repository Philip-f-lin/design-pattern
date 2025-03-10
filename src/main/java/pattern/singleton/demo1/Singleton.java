package pattern.singleton.demo1;

/**
 * 餓漢式：靜態成員變量
 */
public class Singleton {

    // 1. 私有構造方法
    private Singleton(){}

    // 2. 在本類中創建本類物件
    private static Singleton instance = new Singleton();

    // 3. 提供一個公共的訪問方式，讓外界獲取該物件
    public static Singleton getInstance(){
        return instance;
    }
}
