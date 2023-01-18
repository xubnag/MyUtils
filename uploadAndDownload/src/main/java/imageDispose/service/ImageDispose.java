package imageDispose.service;

import java.awt.*;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/15 10:52
 * @Description 图片处理 抽象公共接口
 */
public interface ImageDispose {
    /**
     * 图片上传指定bucketName，返回存储url
     * @param image
     * @param bucketName
     * @return
     */
    String upload(Image image, String bucketName);

    /**
     * 根据指定url，下载图片
     * @param url
     * @return
     */
    Image download(String url);

}
