package pattern.combination;

import javax.naming.OperationNotSupportedException;

/**
 * 菜單組件：屬於抽象根節點
 */
public abstract class MenuComponent {

    // 菜單組件的名稱
    protected String name;

    // 菜單組件的層級
    protected int level;

    // 添加子菜單
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    // 移除子菜單
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    // 獲取指定的子菜單
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    // 獲取菜單或著菜單項的名稱
    public String getName(){
        return name;
    }

    // 打印菜單名稱的方法（包含子菜單和子菜單項）
    public abstract void print();


}
