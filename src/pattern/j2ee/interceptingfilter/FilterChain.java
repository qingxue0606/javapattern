 package pattern.j2ee.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 * @author xiang
 * @date 2018/12/18
 */
public class FilterChain {
    //过滤器list
    private List<Filter> filters = new ArrayList<Filter>();
    //目标
    private Target target;
    //增回过滤器
    public void addFilter(Filter filter){
        filters.add(filter);
     }
    //执行，行执行过滤器，再执行目标
    public void execute(String request){
        for (Filter filter : filters) {
           filter.execute(request);
        }
        target.execute(request);
     }
    //设定目标
    public void setTarget(Target target){
        this.target = target;
     }

}
