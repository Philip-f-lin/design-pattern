package pattern.bridge;

/**
 * rmvb 影片文件（具體的實現化角色）
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb 影片文件：" + fileName);
    }
}
