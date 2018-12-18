 package pattern.j2ee.servicelocator;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class ServiceLocator {
    //1初始化一个缓存
    private static Cache cache;
    static {
        cache = new Cache();    
     }
  //2从缓存中得到service
    public static Service getService(String jndiName){
      //3有就从缓存中得到
        Service service = cache.getService(jndiName);
   
        if(service != null){
           return service;
        }
      //3没有就新建一个并加入到缓存中
        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
     }

}
