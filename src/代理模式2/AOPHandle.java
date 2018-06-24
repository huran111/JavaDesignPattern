package 代理模式2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:02 2018/6/24
 * @Modified By:
 */
public class AOPHandle implements InvocationHandler {
    private Object object;
    AOPHandle(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置代理");
        Object invoke = method.invoke(object, args);
        System.out.println("后置代理");
        return invoke;
    }
}
