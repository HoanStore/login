package com.hoan.Log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Test {

    private static Logger logger = LogManager.getLogger(Log4j_Test.class);

    public static void main(String[] args) {


        logger.error("error World");
        logger.info("info World");
        logger.debug("debug World");
        logger.trace("trace World");
    }
}
