package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:HuRan
 * @Description: 动态代理的Handler
 * @Date: Created in 11:41 2018/6/24
 * @Modified By:
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null;

    MyInvocationHandler(Object _object) {
        this.target = _object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
