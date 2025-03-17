package pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理物件工廠，用來獲取代理物件
 */
public class ProxyFactory implements MethodInterceptor {

    // 聲明火車站物件
    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        // 創建 Enhancer 物件，類似於 JDK 代理中的 Proxy 類
        Enhancer enhancer = new Enhancer();
        // 設置父類的字節碼物件，指定父類
        enhancer.setSuperclass(TrainStation.class);
        // 設置回調函數
        enhancer.setCallback(this);
        // 創建代理物件
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售點收取一定的服務費用(CGLIB 動態代理)");
        // 要調用目標物件的方法
        Object obj = method.invoke(station, objects);
        return obj;
    }

}
