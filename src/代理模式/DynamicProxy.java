package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author:HuRan
 * @Description: 动态代理类
 * @Date: Created in 11:43 2018/6/24
 * @Modified By:
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            //执行一个前置通知
            new BeforeAdvice().exec();
        }
        T t = (T) Proxy.newProxyInstance(loader, interfaces, handler);
        //执行目标，并返回结果
        return t;
    }
}
