package pattern.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        // 創建代理工廠物件
        ProxyFactory factory = new ProxyFactory();
        // 獲取代理物件
        TrainStation proxyObject = factory.getProxyObject();
        // 調用代理物件中的 sell 方法賣票
        proxyObject.sell();
    }
}
