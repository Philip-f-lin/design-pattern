package principles.demo3.before;

public class ComputerDemo {
    public static void main(String[] args) {
        // 創建組件物件
        CPU cpu = new CPU();
        Disk disk = new Disk();
        Memory memory = new Memory();

        // 創建電腦物件
        Computer computer = new Computer();
        // 組裝電腦
        computer.setCpu(cpu);
        computer.setDisk(disk);
        computer.setMemory(memory);

        // 啟動電腦
        computer.run();
    }
}
