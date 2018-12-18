 package pattern.j2ee.businessdelegate;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        //跟据类型找服务
        if(serviceType.equalsIgnoreCase("EJB")){
           return new EJBService();
        }else {
           return new JMSService();
        }
     }
}
