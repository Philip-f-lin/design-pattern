package pattern.decorator;

/**
 * 炒飯（具體構建角色）(Concrete Component)
 */
public class FriedRice extends FastFood{

    public FriedRice(){
        super(10, "炒飯");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
