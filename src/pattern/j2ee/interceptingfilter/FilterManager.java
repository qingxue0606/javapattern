 package pattern.j2ee.interceptingfilter;

 /**
  * 
 * @author xiang
 * @date 2018/12/18
 */
public class FilterManager {
    //定一个过滤链
    FilterChain filterChain;
    public FilterManager(Target target){
        //构造方法里 新建一个过滤链
        filterChain = new FilterChain();
        //设定过滤链的目标
        filterChain.setTarget(target);
     }
    //增加过滤条件
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
     }
    //执行过滤链
    public void filterRequest(String request){
        filterChain.execute(request);
     }

}
