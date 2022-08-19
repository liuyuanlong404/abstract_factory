package com.lakers.abstract_factory.factory;

import com.lakers.abstract_factory.factory.product.OssImage;
import com.lakers.abstract_factory.factory.product.OssVideo;

/**
 * Created on 2022/8/19 15:45
 *
 * @author Lakers
 */
public interface AbstractOssFactory {

    /**
     * 上传图片
     *
     * @param bytes 字节数组
     * @return ossImage
     */
    OssImage uploadImage(byte[] bytes);

    /**
     * 上传视频
     *
     * @param bytes 字节数组
     * @return ossVideo
     */
    OssVideo uploadVideo(byte[] bytes);
}
