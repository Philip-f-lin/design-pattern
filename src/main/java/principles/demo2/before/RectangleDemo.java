package principles.demo2.before;

public class RectangleDemo {

    public static void main(String[] args) {
        // 創建長方形物件
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        // 擴長
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("===========");

        // 創建正方形物件
        Square square = new Square();
        square.setWidth(10);
        resize(square);
        printLengthAndWidth(square);
    }

    // 擴長方法
    public static void resize(Rectangle rectangle){
        // 如果長比寬小，把長度變大
        while (rectangle.getLength() <= rectangle.getWidth()){
            rectangle.setLength(rectangle.getLength() + 1);
        }
    }

    // 顯示長和寬
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
