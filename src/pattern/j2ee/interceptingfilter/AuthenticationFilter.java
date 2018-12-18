 package pattern.j2ee.interceptingfilter;

 /**
  * 权限过滤
 * @author xiang
 * @date 2018/12/18
 */
public class AuthenticationFilter implements Filter  {

    /** (non-Javadoc)
     * @see pattern.j2ee.interceptingfilter.Filter#execute(java.lang.String)
     */
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
         
    }

}
