package principles.demo4.before;

public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor heimaSafetyDoor = new HeimaSafetyDoor();
        heimaSafetyDoor.antiTheft();
        heimaSafetyDoor.fireProof();
        heimaSafetyDoor.waterProof();
    }
}
