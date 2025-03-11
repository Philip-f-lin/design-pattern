package pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * 測試使用反射破壞單例模式
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 1. 獲取 Singleton 的字解碼物件
        Class<Singleton> clazz = Singleton.class;
        // 2. 獲取無參的構造函數
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        // 3. 取消訪問檢查
        cons.setAccessible(true);
        // 4. 創建 Singleton 物件
        Singleton s1 = cons.newInstance();
        Singleton s2 = cons.newInstance();

        System.out.println(s1 == s2);// 如果是 true，說明沒有破壞單例模式，如果是 false，說明破壞單例模式
    }
}
