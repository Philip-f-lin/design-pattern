package pattern.adapter.class_adapter;

/**
 * 目標接口
 */
public interface SDCard {

    // 從 SD 卡中讀取資料
    String readSD();
    // 往 SD 卡中寫資料
    void writeSD(String msg);
}
