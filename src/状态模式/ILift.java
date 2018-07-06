package 状态模式;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 14:58 2018/7/6
 * @Modified By:
 */
public interface ILift {
    public final static int OPEN = 1;//开门
    public final static int CLOSE = 2;//关门
    public final static int RUN = 3;//运行
    public final static int STOP = 4;//停止

    //设置状态
    public void setState(int state);

    void open();

    void close();

    void run();

    void stop();

}
