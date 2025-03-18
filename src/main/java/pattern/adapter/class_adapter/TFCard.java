package pattern.adapter.class_adapter;

/**
 * 適配者類接口
 */
public interface TFCard {

    // 從 TF 卡中讀取資料
    String readTF();
    // 往 TF 中寫入資料
    void writeTF(String msg);
}
