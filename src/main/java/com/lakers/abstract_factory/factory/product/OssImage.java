package com.lakers.abstract_factory.factory.product;

/**
 * Created on 2022/8/19 16:31
 *
 * @author Lakers
 */
public interface OssImage {

    /**
     * 获取缩略图
     *
     * @return string
     */
    String getThumb();

    /**
     * 获取水印图
     *
     * @return String
     */
    String getWatermark();

    /**
     * 获取图片AI放大
     *
     * @return string
     */
    String getEnhance();
}
