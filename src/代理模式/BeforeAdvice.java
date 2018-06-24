package 代理模式;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 11:46 2018/6/24
 * @Modified By:
 */
public class BeforeAdvice  implements IAdvice{
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了。。。");
    }
}
