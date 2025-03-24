package pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜單類：屬於樹枝節點
 */
public class Menu extends MenuComponent{

    // 菜單可以有多個子菜單項
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    // 構造方法
    public Menu(String name, int level){
        this.name = name;
        this.level = level;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        // 打印菜單名稱
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);

        // 打印子菜單或著子菜單項的名稱
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
