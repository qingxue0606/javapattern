 package pattern.j2ee.businessdelegate;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class EJBService implements BusinessService {

    /** (non-Javadoc)
     * @see pattern.j2ee.businessdelegate.BusinessService#doProcessing()
     */
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
         
    }

}
