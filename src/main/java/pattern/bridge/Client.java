package pattern.bridge;

public class Client {
    public static void main(String[] args) {
        // 創建 mac 系統物件
        OperatingSystem os = new Mac(new AviFile());
        // 使用操作系統播放影片
        os.play("炎炎消防隊");
    }
}
