package pattern.j2ee.businessdelegate;

/**
* @author xiang
* @date 2018/12/18
*/
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
