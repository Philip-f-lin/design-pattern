package principles.demo3.after;

/**
 * 硬碟
 */
public class AppleDisk implements HardDisk{

    // 儲存資料的方法
    public void save(String data){
        System.out.println("使用 Apple 硬碟儲存資料：" + data);
    }

    // 獲取資料的方法
    public String get(){
        System.out.println("使用 Apple 硬碟獲取資料");
        return "資料";
    }
}
