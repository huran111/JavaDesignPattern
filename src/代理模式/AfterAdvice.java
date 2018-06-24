package 代理模式;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:56 2018/6/24
 * @Modified By:
 */
public class AfterAdvice implements IAfter {
    @Override
    public void exec() {
        System.out.println("我是后置通知..........");
    }
}
