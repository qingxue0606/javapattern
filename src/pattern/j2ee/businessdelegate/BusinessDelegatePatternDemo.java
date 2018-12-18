 package pattern.j2ee.businessdelegate;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
    

}
