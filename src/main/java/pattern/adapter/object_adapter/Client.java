package pattern.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        // 創建計算機物件
        Computer computer = new Computer();
        // 讀取 SD 卡中的資料
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("==============");
        // 使用該電腦讀取 TF 卡中的資料
        // 創建適配器類物件
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
