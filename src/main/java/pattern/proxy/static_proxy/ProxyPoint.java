package pattern.proxy.static_proxy;

/**
 * 代售點類
 */
public class ProxyPoint implements SellTickets{

    // 聲明火車站類物件
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售點收取服務費用");
        trainStation.sell();
    }
}
