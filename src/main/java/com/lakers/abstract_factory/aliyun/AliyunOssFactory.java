package com.lakers.abstract_factory.aliyun;

import com.lakers.abstract_factory.aliyun.product.AliyunOssImage;
import com.lakers.abstract_factory.aliyun.product.AliyunOssVideo;
import com.lakers.abstract_factory.factory.AbstractOssFactory;
import com.lakers.abstract_factory.factory.product.OssImage;
import com.lakers.abstract_factory.factory.product.OssVideo;

/**
 * Created on 2022/8/19 16:39
 *
 * @author Lakers
 */
public class AliyunOssFactory implements AbstractOssFactory {

    @Override
    public OssImage uploadImage(byte[] bytes) {
        return new AliyunOssImage(bytes, "Lakers", Boolean.FALSE);
    }

    @Override
    public OssVideo uploadVideo(byte[] bytes) {
        return new AliyunOssVideo(bytes, "Lakers");
    }
}
