package com.lakers.abstract_factory.quniu.product;

import com.lakers.abstract_factory.factory.product.OssImage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2022/8/19 16:40
 *
 * @author Lakers
 */
public class QiniuyunOssImage implements OssImage {

    private final Logger log = LoggerFactory.getLogger(QiniuyunOssImage.class);

    private byte[] bytes;

    public QiniuyunOssImage(byte[] bytes, String watermark) {
        this.bytes = bytes;
        log.info("[七牛云]图片已经上传至七牛云OSS");
        log.info("[七牛云]已生成图片缩略图，尺寸640*480像素");
        log.info("[七牛云]已为图片增加水印，水印文本：{}", watermark);
        log.info("[七牛云]已将图片Ai增强为4K画质");
    }

    @Override
    public String getThumb() {
        return "http://oss.qiniu.com/*********_thumb.jpg";
    }

    @Override
    public String getWatermark() {
        return "http://oss.qiniu.com/*********_watermark.jpg";
    }

    @Override
    public String getEnhance() {
        return "http://oss.qiniu.com/*********_enhance.jpg";
    }
}
