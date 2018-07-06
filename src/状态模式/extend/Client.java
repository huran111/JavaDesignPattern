package 状态模式.extend;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 15:27 2018/7/6
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();

    }
}
