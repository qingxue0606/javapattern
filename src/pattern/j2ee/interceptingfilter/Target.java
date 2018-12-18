 package pattern.j2ee.interceptingfilter;

 /**
  * 目标对象
 * @author xiang
 * @date 2018/12/18
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
     }

}
