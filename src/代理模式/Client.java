package 代理模式;

import java.lang.reflect.InvocationHandler;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 11:48 2018/6/24
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        Subject subject=new RealSubject();
        InvocationHandler handler=new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxyInstance = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        proxyInstance.doSomething("Finish");
    }
}
