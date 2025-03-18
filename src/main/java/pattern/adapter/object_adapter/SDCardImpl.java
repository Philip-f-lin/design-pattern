package pattern.adapter.object_adapter;

/**
 * 具體的 SD 卡
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard read msg :" + msg);
    }
}
