package com.lakers.abstract_factory.aliyun.product;

import com.lakers.abstract_factory.factory.product.OssImage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2022/8/19 16:40
 *
 * @author Lakers
 */
public class AliyunOssImage implements OssImage {

    private final Logger log = LoggerFactory.getLogger(AliyunOssImage.class);

    private byte[] bytes;

    public AliyunOssImage(byte[] bytes, String watermark, boolean transparent) {
        this.bytes = bytes;
        log.info("[阿里云]图片已经上传至阿里云OSS");
        log.info("[阿里云]已生成图片缩略图，尺寸640*480像素");
        log.info("[阿里云]已为图片增加水印，水印文本：{}，是否透明：{}", watermark, transparent);
        log.info("[阿里云]已将图片Ai增强为4K画质");
    }

    @Override
    public String getThumb() {
        return "http://oss.aliyun.com/*********_thumb.jpg";
    }

    @Override
    public String getWatermark() {
        return "http://oss.aliyun.com/*********_watermark.jpg";
    }

    @Override
    public String getEnhance() {
        return "http://oss.aliyun.com/*********_enhance.jpg";
    }
}
