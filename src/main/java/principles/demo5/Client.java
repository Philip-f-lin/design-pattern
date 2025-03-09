package principles.demo5;

public class Client {
    public static void main(String[] args) {
        // 創建經紀人
        Agent agent = new Agent();
        // 創建明星物件
        Star star =  new Star("Jay");
        agent.setStar(star);
        // 創建粉絲物件
        Fans fans = new Fans("Philip");
        agent.setFans(fans);
        // 創建媒體公司物件
        Company company = new Company("Apple媒體公司");
        agent.setCompany(company);
        agent.meeting();
        agent.business();

    }
}
