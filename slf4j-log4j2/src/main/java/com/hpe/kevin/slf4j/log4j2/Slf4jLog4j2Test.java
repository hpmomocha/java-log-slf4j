package com.hpe.kevin.slf4j.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLog4j2Test {
    private static final Logger logger = LoggerFactory.getLogger(Slf4jLog4j2Test.class);

    public static void main(String[] args) {
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");

        // 占位符输出
        String name = "Kevin";
        int age = 40;
        logger.info("用户信息: {}, {}", name, age);

        // 异常信息输出
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            logger.error("发生异常:", e);
        }
    }
}
