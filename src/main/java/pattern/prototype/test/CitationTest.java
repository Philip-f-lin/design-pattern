package pattern.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 創建原型物件
        Citation citation = new Citation();
        // 創建 Andy 學生物件
        Student stu = new Student();
        stu.setName("Andy");
        citation.setStu(stu);
        // 2. 克隆獎狀物件
        Citation citation1 = citation.clone();
        Student stu1 = citation1.getStu();
        stu1.setName("Mary");
        citation1.setStu(stu1);

        /*citation.setName("Andy");
        citation1.setName("Mary");*/

        // 3. 調用 show 方法
        citation.show();
        citation1.show();
    }
}
