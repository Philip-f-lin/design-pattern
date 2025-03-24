package pattern.combination;

/**
 * 菜單項類：屬於葉子節點
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level){
        this.name = name;
        this.level = level;
    }
    @Override
    public void print() {
        // 打印菜單項的名稱
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
