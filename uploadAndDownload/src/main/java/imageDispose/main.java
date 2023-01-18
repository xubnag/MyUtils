package imageDispose;

import imageDispose.factory.ImageDisposeFactory;
import imageDispose.service.ImageDispose;

import java.awt.*;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/15 11:06
 * @Description
 */
public class main {

    public static void main(String[] args) {
        ImageDispose imageDispose = ImageDisposeFactory.newInstance("");
        String upload = imageDispose.upload(new Image(), "");
    }




}