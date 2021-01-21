package org.zeroturnaround.zip.compat;

public class Logger4j {
    private boolean isLog4j = true;

    public Logger4j() {
    }

    public boolean isTraceEnabled() {
        return false;
    }

    public void debug(String s, Object... objects) {

    }

    public void trace(String s, Object... objects) {

    }

    public boolean isDebugEnabled() {
        return false;
    }
}
