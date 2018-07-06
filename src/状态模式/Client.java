package 状态模式;

import javax.naming.Context;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 15:02 2018/7/6
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {

        ILift lift=new Lift();
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
        lift.setState(ILift.STOP);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
