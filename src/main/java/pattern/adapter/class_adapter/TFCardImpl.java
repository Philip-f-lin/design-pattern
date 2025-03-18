package pattern.adapter.class_adapter;

/**
 * 適配者類
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello word TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard read msg :" + msg);
    }
}
