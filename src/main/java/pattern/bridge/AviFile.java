package pattern.bridge;

/**
 * avi 影片文件（具體的實現化角色）
 */
public class AviFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("avi 影片文件：" + fileName);
    }
}
