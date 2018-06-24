package 代理模式2;

import java.lang.reflect.Proxy;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:04 2018/6/24
 * @Modified By:
 */
public class App {
    public static void main(String[] args) {
        ManSayHelloWorld sayHelloWorld = new ManSayHelloWorld();
        AOPHandle handle = new AOPHandle(sayHelloWorld);
        ISayHelloWorld i = (ISayHelloWorld) Proxy.newProxyInstance(ManSayHelloWorld.class.getClassLoader(), new Class[] { ISayHelloWorld.class }, handle);
        i.say();
    }
}
