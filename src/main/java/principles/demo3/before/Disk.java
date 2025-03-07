package principles.demo3.before;

/**
 * 硬碟
 */
public class Disk {

    // 儲存資料的方法
    public void save(String data){
        System.out.println("使用硬碟儲存資料：" + data);
    }

    // 獲取資料的方法
    public String get(){
        System.out.println("使用硬碟獲取資料");
        return "資料";
    }
}
