package principles.demo3.after;

public class ComputerDemo {
    public static void main(String[] args) {

        // 創建電腦組件物件
        CPU cpu = new AppleCPU();
        HardDisk hardDisk = new AppleDisk();
        Memory memory = new AppleMemory();

        // 創建電腦物件
        Computer computer = new Computer();

        // 組裝電腦
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        // 啟動電腦
        computer.run();
    }
}
