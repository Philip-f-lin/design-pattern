package pattern.singleton.demo8;

import java.io.Serializable;

public class Singleton implements Serializable {
    // 私有構造函數
    private Singleton() {
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