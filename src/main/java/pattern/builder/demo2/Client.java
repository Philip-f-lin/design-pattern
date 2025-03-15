package pattern.builder.demo2;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星螢幕")
                .memory("AMD 記憶體")
                .mainBoard("華碩主機板")
                .build();

        System.out.println(phone);
    }
}
