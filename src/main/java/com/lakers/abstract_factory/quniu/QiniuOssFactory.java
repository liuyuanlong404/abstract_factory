package com.lakers.abstract_factory.quniu;

import com.lakers.abstract_factory.factory.AbstractOssFactory;
import com.lakers.abstract_factory.factory.product.OssImage;
import com.lakers.abstract_factory.factory.product.OssVideo;
import com.lakers.abstract_factory.quniu.product.QiniuOssVideo;
import com.lakers.abstract_factory.quniu.product.QiniuyunOssImage;

/**
 * Created on 2022/8/19 16:39
 *
 * @author Lakers
 */
public class QiniuOssFactory implements AbstractOssFactory {

    @Override
    public OssImage uploadImage(byte[] bytes) {
        return new QiniuyunOssImage(bytes, "Lakers");
    }

    @Override
    public OssVideo uploadVideo(byte[] bytes) {
        return new QiniuOssVideo(bytes, "Lakers");
    }
}
