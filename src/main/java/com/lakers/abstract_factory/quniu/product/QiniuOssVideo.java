package com.lakers.abstract_factory.quniu.product;

import com.lakers.abstract_factory.factory.product.OssVideo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2022/8/19 17:08
 *
 * @author Lakers
 */
public class QiniuOssVideo implements OssVideo {

    private final Logger log = LoggerFactory.getLogger(QiniuyunOssImage.class);

    private byte[] bytes;

    public QiniuOssVideo(byte[] bytes, String watermark) {
        this.bytes = bytes;
        log.info("[七牛云]视频已经上传至七牛云OSS，水印文本为：{}", watermark);
        log.info("[七牛云]720P视频转码成功");
        log.info("[七牛云]1080P视频转码成功");
    }

    @Override
    public String get720P() {
        return "http://oss.aliyun.com/*********_720P.mp4";
    }

    @Override
    public String get1080P() {
        return "http://oss.aliyun.com/*********_1080P.mp4";
    }
}
