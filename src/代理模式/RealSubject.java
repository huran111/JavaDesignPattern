package 代理模式;

/**
 * @author:HuRan
 * @Description: 真是主题
 * @Date: Created in 11:40 2018/6/24
 * @Modified By:
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething(String str) {
        System.out.println("做一些事情......");
    }
}
