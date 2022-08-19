package com.lakers.abstract_factory;

import com.lakers.abstract_factory.aliyun.AliyunOssFactory;
import com.lakers.abstract_factory.factory.AbstractOssFactory;
import com.lakers.abstract_factory.factory.product.OssImage;
import com.lakers.abstract_factory.factory.product.OssVideo;
import com.lakers.abstract_factory.quniu.QiniuOssFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbstractFactoryApplicationTests {

    private final Logger log = LoggerFactory.getLogger(AbstractFactoryApplicationTests.class);

    @Test
    void contextLoads() {
        AbstractOssFactory abstractOssFactory = new QiniuOssFactory();
        OssImage ossImage = abstractOssFactory.uploadImage(new byte[1024]);
        OssVideo ossVideo = abstractOssFactory.uploadVideo(new byte[1024]);
        log.info(ossImage.getThumb());
        log.info(ossImage.getWatermark());
        log.info(ossImage.getEnhance());
        log.info(ossVideo.get720P());
        log.info(ossVideo.get1080P());
    }

}
