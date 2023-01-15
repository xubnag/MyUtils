package imageDispose;

import org.apache.commons.lang3.StringUtils;

import java.awt.*;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/15 10:51
 * @Description 私有云图片处理实现类
 */
public class PrivateImageDispose implements ImageDispose{
    @Override
    public String upload(Image image, String bucketName) {
        if(StringUtils.isNotEmpty(bucketName)){
            createBucketIfNotExisting(bucketName);
        }
        return null;
    }

    @Override
    public Image download(String url) {

        return null;
    }

    private void createBucketIfNotExisting(String bucketName) {
        // ...创建bucket...
        // ...失败会抛出异常..
    }
}