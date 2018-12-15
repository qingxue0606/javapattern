package pattern.behavioral.chainofresponsibility;

/**
* @author xiang
* @date 2018/12/15
*/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);

    }

}
