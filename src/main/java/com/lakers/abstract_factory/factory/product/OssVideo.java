package com.lakers.abstract_factory.factory.product;

/**
 * Created on 2022/8/19 16:31
 *
 * @author Lakers
 */
public interface OssVideo {

    /**
     * 获取720P视频
     *
     * @return string
     */
    String get720P();

    /**
     * 获取1080P视频
     *
     * @return string
     */
    String get1080P();
}
