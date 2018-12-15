package pattern.behavioral.chainofresponsibility;

/**
* @author xiang
* @date 2018/12/15
*/
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    // 责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        // 符合某个条件就处理
        if (this.level <= level) {
            write(message);
        }
        //如果有下一个，就一个继续执行某个方法 
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
