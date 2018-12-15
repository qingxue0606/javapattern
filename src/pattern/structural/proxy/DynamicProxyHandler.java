package pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiang
 * @date 2018/12/14
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    /** (non-Javadoc)
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
        Object result = method.invoke(object, args);
        System.out.println("买房后装修");
        return result;
    }

}
