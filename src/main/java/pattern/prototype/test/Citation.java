package pattern.prototype.test;

public class Citation implements Cloneable{

    // 學生姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }

    public void show(){
        System.out.println(name + "表現優秀，頒發獎狀");
    }
}
