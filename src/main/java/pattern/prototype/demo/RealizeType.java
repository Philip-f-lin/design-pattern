package pattern.prototype.demo;

public class RealizeType implements Cloneable{

    public RealizeType(){
        System.out.println("具體的原型物件創建完成");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具體原型複製成功");
        return (RealizeType)super.clone();
    }
}
