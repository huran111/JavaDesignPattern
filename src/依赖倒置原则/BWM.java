package 依赖倒置原则;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:42 2018/6/25
 * @Modified By:
 */
public class BWM implements ICar {
    @Override
    public void run() {
        System.out.println("宝马车开始运行.....");
    }
}
