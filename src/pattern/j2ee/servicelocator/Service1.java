 package pattern.j2ee.servicelocator;

 /**
  * 服务一
 * @author xiang
 * @date 2018/12/18
 */
public class Service1 implements Service{

    /** (non-Javadoc)
     * @see pattern.j2ee.servicelocator.Service#getName()
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Service1";
    }

    /** (non-Javadoc)
     * @see pattern.j2ee.servicelocator.Service#execute()
     */
    @Override
    public void execute() {
        System.out.println("Executing Service1");
         
    }

}
