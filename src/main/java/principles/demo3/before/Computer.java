package principles.demo3.before;

public class Computer {

    private Disk disk;
    private CPU cpu;
    private Memory memory;

    public void run(){
        System.out.println("使用電腦");
        String data = disk.get();
        System.out.println("從硬碟上獲取資料：" + data);
        cpu.run();
        memory.save();
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
