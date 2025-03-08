package principles.demo4.before;

/**
 * 黑馬品牌安全門
 */
public class HeimaSafetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("防盜");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
