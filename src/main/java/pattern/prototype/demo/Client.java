package pattern.prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 創建一個原型類物件
        RealizeType realizeType = new RealizeType();
        // 調用 RealizeType 類中的 clone 方法進行物件拷貝
        RealizeType clone = realizeType.clone();

        System.out.println("原型物件和拷貝出來的是否為同個物件？" + (realizeType == clone));
    }
}
