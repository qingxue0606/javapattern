 package pattern.j2ee.frontcontroller;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
     }

}
