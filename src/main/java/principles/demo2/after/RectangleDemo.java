package principles.demo2.after;

public class RectangleDemo {
    public static void main(String[] args) {
        // 創建長方形物件
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(20);

        resize(r);

        printLengthAndWidth(r);
    }

    public static void resize(Rectangle rectangle) {
        // 如果長比寬小，把長度變大
        while (rectangle.getLength() <= rectangle.getWidth()) {
            rectangle.setLength(rectangle.getLength() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
