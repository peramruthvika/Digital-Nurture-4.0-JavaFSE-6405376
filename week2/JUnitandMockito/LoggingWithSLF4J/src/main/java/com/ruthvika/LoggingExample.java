package com.ruthvika;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // 🔥 Logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("This is an ERROR message");
        logger.warn("This is a WARNING message");
        logger.info("ℹThis is an INFO message (won't show by default)");
    }
}
