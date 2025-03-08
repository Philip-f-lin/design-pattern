package principles.demo3.after;

public class Computer {
    private CPU cpu;
    private HardDisk hardDisk;
    private Memory memory;

    public void run(){
        System.out.println("使用電腦");
        String data = hardDisk.get();
        System.out.println("從 Apple 硬碟上獲取資料：" + data);
        cpu.run();
        memory.save();
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
