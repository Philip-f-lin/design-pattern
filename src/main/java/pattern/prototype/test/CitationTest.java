package pattern.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 創建原型物件
        Citation citation = new Citation();
        // 2. 克隆獎狀物件
        Citation citation1 = citation.clone();

        citation.setName("Andy");
        citation1.setName("Mary");

        // 3. 調用 show 方法
        citation.show();
        citation1.show();
    }
}
