package pattern.j2ee.interceptingfilter;

/**
 * debug权限过滤
* @author xiang
* @date 2018/12/18
*/
public class DebugFilter implements Filter {

    /** (non-Javadoc)
     * @see pattern.j2ee.interceptingfilter.Filter#execute(java.lang.String)
     */
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);

    }

}
