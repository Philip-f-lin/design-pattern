package pattern.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        // 創建代售點類物件
        ProxyPoint proxyPoint = new ProxyPoint();
        // 調用方法買票（對客戶來說是買票，對火車站來說是賣票）
        proxyPoint.sell();
    }
}
