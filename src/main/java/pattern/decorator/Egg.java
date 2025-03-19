package pattern.decorator;

/**
 * 雞蛋類（具體的裝飾者角色）
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(fastFood, 1, "雞蛋");
    }
    @Override
    public float cost() {
        // 計算價格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc(){
        return super.getDesc() + getFastFood().getDesc();
    }
}
