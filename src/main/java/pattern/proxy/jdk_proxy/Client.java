package pattern.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        // 獲取代理物件
        // 1. 創建代理工廠物件
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用 factory 物件的方法獲取代理物件
        SellTickets proxyObject = factory.getProxyObject();
        // 3. 調用賣的方法
        proxyObject.sell();
    }
}
