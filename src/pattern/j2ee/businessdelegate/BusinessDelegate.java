 package pattern.j2ee.businessdelegate;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
     }
    public void doTask(){
        //找到对应的服务，然后注入到businessService，再执行对应方法
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();     
     }
}
