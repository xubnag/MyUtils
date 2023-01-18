package imageDispose.uitl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/15 13:39
 * @Description 文件处理工具
 */
public class FileUtils {
    private FileUtils() {}

    public static Properties load(String path) {

        Properties properties = null;
        try (InputStream in = new FileInputStream(Paths.get(path).toFile());) {
            properties = new Properties();
            properties.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}