package 状态模式.extend;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 15:20 2018/7/6
 * @Modified By:
 */
public class Context {
    //定义出所有的电梯状态
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closeingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();
    //定义一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        System.out.println(this.getLiftState().toString());

        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
