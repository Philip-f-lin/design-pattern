package principles.demo4.after;

/**
 * 傳智安全門
 */
public class ItcastSafetyDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("防盜");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
