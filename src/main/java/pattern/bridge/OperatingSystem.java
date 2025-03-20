package pattern.bridge;

/**
 * 抽象的操作系統類（抽象化角色）
 */
public abstract class OperatingSystem {

    // 聲明 videoFile 變量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
