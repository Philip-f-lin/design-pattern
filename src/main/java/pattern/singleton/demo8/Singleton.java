package pattern.singleton.demo8;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static boolean flag = false;

    // 私有構造函數
    private Singleton() {
        synchronized (Singleton.class) {
            // 判斷 flag 的值，是否是 true，如果是 true，說明不是第一次訪問，直接拋一個異常
            // 如果是 false，說明是第一次訪問
            if (flag) {
                throw new RuntimeException("不能創建多個物件");
            }
            // 將 flag 設置為 true
            flag = true;
        }
    }

    // 定義一個靜態內部類
    private static class SingletonHolder {
        // 在內部類中聲明並初始化外部類物件
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公共的訪問方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}