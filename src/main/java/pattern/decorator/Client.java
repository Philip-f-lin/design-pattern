package pattern.decorator;

public class Client {
    public static void main(String[] args) {
        // 點一份炒飯
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");

        System.out.println("==========");

        // 在上面的炒飯中加一個雞蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");

        System.out.println("=============");
        // 再加一個雞蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");

        // 再加一個培根
        friedRice = new Bacon(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
    }
}
