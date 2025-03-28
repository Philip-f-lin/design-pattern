package pattern.decorator;

/**
 * 培根類（具體的裝飾者角色）
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc(){
        return super.getDesc() + getFastFood().getDesc();
    }
}
