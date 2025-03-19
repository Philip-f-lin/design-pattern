package pattern.decorator;

/**
 * 炒麵（具體構建角色）(Concrete Component)
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles(){
        super(12, "炒麵");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
