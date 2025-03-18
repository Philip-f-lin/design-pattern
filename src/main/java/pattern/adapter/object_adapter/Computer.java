package pattern.adapter.object_adapter;

/**
 * 計算機類
 */
public class Computer {

    // 從 SD 卡讀取資料
    public String readSD(SDCard sdCard){
        if (sdCard == null){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
