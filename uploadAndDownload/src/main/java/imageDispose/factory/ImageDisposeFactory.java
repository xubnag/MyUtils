package imageDispose.factory;

import imageDispose.impl.AliyunImageDispose;
import imageDispose.impl.PrivateImageDispose;
import imageDispose.service.ImageDispose;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/15 13:20
 * @Description 图片处理  简单工厂
 */
public class ImageDisposeFactory {
    private static final  String PRIVATE="private";
    private static final  String ALIYUN="aliyun";

    public ImageDisposeFactory() {
    }

    /**
     * 根据指定类型，获取不同的实例对象
     * @param disposeType
     * @return
     */
    public static ImageDispose newInstance(String disposeType){
        switch (disposeType){
            case PRIVATE:
                return new PrivateImageDispose();
            case ALIYUN:
                return new AliyunImageDispose();
            default:
                throw new IllegalArgumentException("The specified instance does not exist");
        }

    }
}