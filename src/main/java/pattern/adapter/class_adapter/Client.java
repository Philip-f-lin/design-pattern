package pattern.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        // 創建計算機物件
        Computer computer = new Computer();
        // 讀取 SD 卡中的資料
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("==============");

        // 使用該電腦讀取 TF 卡中的資料
        // 定義適配器類
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
