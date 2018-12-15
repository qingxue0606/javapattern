 package pattern.creational.single;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class SingleObject {
    private static SingleObject instance =new SingleObject();
    private SingleObject() {}
    public static SingleObject getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
