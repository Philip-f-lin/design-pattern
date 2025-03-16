package pattern.proxy.jdk_proxy;

/**
 * 火車站類
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火車站賣票");
    }
}
