package pattern.combination;

public class Client {
    public static void main(String[] args) {
        // 創建菜單樹
        MenuComponent menu1 = new Menu("菜單管理", 2);
        menu1.add(new MenuItem("頁面訪問", 3));
        menu1.add(new MenuItem("展開菜單", 3));
        menu1.add(new MenuItem("編輯菜單", 3));
        menu1.add(new MenuItem("刪除菜單", 3));
        menu1.add(new MenuItem("新增菜單", 3));

        MenuComponent menu2 = new Menu("權限管理", 2);
        menu2.add(new MenuItem("頁面訪問", 3));
        menu2.add(new MenuItem("提交保存", 3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("頁面訪問", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        // 創建一級菜單
        MenuComponent component = new Menu("系統管理", 1);
        // 將二級菜單添加到一級菜單中
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        // 打印菜單名稱(如果有子菜單一起打印)
        component.print();

    }
}
