package pattern.j2ee.interceptingfilter;

/**
* @author xiang
* @date 2018/12/18
*/
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        //建一个过滤器，增加一个目标
        FilterManager filterManager = new FilterManager(new Target());
        //增加两个过滤条件
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        //新建一个客户端，增加过滤理器
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
