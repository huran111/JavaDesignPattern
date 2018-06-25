package 依赖倒置原则;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:44 2018/6/25
 * @Modified By:
 */
public class App {
    public static void main(String[] args) {
        IDriver zhangshan=new Driver();
        ICar   benz=new Benz();
        zhangshan.setCar(benz);
    }
}
