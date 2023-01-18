package imageDispose;

import imageDispose.factory.ImageDisposeFactory;
import imageDispose.service.ImageDispose;
import imageDispose.uitl.FileUtils;

import java.awt.*;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/15 13:37
 * @Description 图片处理 任务
 */
public class ImageProcessingJob {
    private static final String BUCKET_NAME = "ai_images_bucket";
    private static final String STORE_TYPE = "STORE_TYPE";
    private static final String PROP_PATH = "geekbang/designpattern/u009/v2/config.properties";

    public void process() {
        Image image = null;
//    String storeType = prop.getString(STORE_TYPE);
        String storeType = FileUtils.load(PROP_PATH)
                .getProperty(STORE_TYPE);
        ImageDispose imageDispose = ImageDisposeFactory.newInstance(storeType);
        imageDispose.upload(image, BUCKET_NAME);
    }

    public static void main(String[] args) {
        ImageProcessingJob job = new ImageProcessingJob();
        job.process();
    }
}