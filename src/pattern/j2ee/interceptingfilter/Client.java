package pattern.j2ee.interceptingfilter;

/**
* @author xiang
* @date 2018/12/18
*/
public class Client {
    //过滤链
    FilterManager filterManager;
    //方法增加过滤
    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }
    //当sendrquesust时，执行过滤
    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }

}
