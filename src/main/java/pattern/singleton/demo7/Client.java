package pattern.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 測試使用序列化破壞單例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    // 從文件讀取數據（物件）
    public static void readObjectFromFile() throws Exception{
        // 1. 創建物件輸入流物件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/linzhuofei/Desktop/a.txt"));
        // 2. 讀取物件
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        // 3.釋放資源
        ois.close();
    }

    // 向文件中寫數據（物件）
    public static void writeObject2File() throws Exception{
        // 1. 獲取 Singleton 物件
        Singleton instance = Singleton.getInstance();
        // 2. 創建物件輸出流物件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/linzhuofei/Desktop/a.txt"));
        // 3. 寫物件
        oos.writeObject(instance);
        oos.close();
    }
}
