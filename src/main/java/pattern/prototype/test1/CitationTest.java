package pattern.prototype.test1;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws Exception {
        // 1. 創建原型物件
        Citation citation = new Citation();
        // 創建 Andy 學生物件
        Student student = new Student();
        student.setName("Andy");
        citation.setStu(student);

        // 創建物件輸出流物件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/linzhuofei/Desktop/a.txt"));
        // 寫物件
        oos.writeObject(citation);
        // 釋放資源
        oos.close();

        // 創建物件輸入流物件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/linzhuofei/Desktop/a.txt"));
        // 獲取物件
        Citation citation1 = (Citation)ois.readObject();
        // 釋放資源
        ois.close();
        Student student1 = citation1.getStu();
        student1.setName("Mary");

        citation.show();
        citation1.show();
    }
}
