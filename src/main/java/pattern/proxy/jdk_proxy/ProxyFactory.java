package pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 獲取代理物件的工廠類，代理類也實現了對應的接口
 */
public class ProxyFactory {

    // 聲明目標物件
    private TrainStation trainStation = new TrainStation();

    // 獲取代理物件的方法
    public SellTickets getProxyObject(){
        /**
         * CLassLoader Loader：類加載器，用於載入代理類。可以透過目標物件取得類加載器
         * CLass<？>［］ interfaces： 代理類實現的介面的字節碼物件
         * InvocationHandler h： 代理物件的調用處理程序
         */
        SellTickets sellTickets = (SellTickets)Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * Object proxy：代理物件。和 proxyObject 物件是同一個物件，在 invoke 方法中墓本不用
                     * Method method：對接口中的方法進行封裝的 method 物件
                     * Object[] args：調用方法的實際參數
                     * 返回值：方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("執行 invoke 成功");
                        System.out.println("代售點收取一定的服務費用(jdk動態代理)");
                        // 執行目標物件的方法
                        Object obj = method.invoke(trainStation, args);
                        return obj;
                    }
                }
        );

        return sellTickets;
    }
}
