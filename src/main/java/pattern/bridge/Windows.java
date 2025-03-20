package pattern.bridge;

/**
 * Windows 操作系統（擴展抽象化角色）
 */
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile){
        super(videoFile);
    }
    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
