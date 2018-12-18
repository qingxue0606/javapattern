 package pattern.j2ee.businessdelegate;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class Client {
    BusinessDelegate businessService;
    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
     }
    public void doTask(){      
        businessService.doTask();
     }
}
