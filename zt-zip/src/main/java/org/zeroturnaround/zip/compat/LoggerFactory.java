package org.zeroturnaround.zip.compat;


public class LoggerFactory {
    private static Logger logger = new Logger();

    public static Logger getLogger(String name) {
        return logger;
    }
}
