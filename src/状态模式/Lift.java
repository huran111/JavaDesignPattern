package 状态模式;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 15:00 2018/7/6
 * @Modified By:
 */
public class Lift implements ILift {
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        System.out.println("电梯门开启");
        switch (this.state) {
            case OPEN:
                break;
            case CLOSE:
                this.openWithoutLogic();
                this.setState(OPEN);
                break;
            case RUN:
                break;
            case STOP:
                this.openWithoutLogic();
                this.setState(OPEN);
                break;
        }
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
        switch (this.state) {
            case OPEN:
                this.closeWithoutLogic();
                this.setState(CLOSE);
                break;
            case CLOSE:
                break;
            case RUN:
                break;
            case STOP:
                break;
        }
    }

    @Override
    public void run() {
        System.out.println("电梯运行");
        switch (this.state) {
            case OPEN: //敞门状态，什么都不做
                // do nothing;
                break;
            case CLOSE: //闭门状态，则可以运行
                this.runWithoutLogic();
                this.setState(RUN);
                break;
            case RUN: //运行状态，则什么都不做
                // do nothing;
                break;
            case STOP: //停止状态，可以运行
                this.runWithoutLogic();
                this.setState(RUN);
        }
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
        switch (this.state) {
            case OPEN: //敞门状态，要先停下来的，什么都不做
                // do nothing;
                break;
            case CLOSE:
                //闭门状态，则当然可以停止了
                this.stopWithoutLogic();
                this.setState(CLOSE);
                break;
            case RUN: //运行状态，有运行当然那也就有停止了
                this.stopWithoutLogic();
                this.setState(CLOSE);
                break;
            case STOP:
                // 停止状态，什么都不做
                // do nothing;
                break;
        }
    }

    //纯粹的电梯关门，不考虑实际的逻辑
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }

    //纯粹的电梯开门，不考虑任何条件
    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }

    //纯粹的运行，不考虑其他条件
    private void runWithoutLogic() {
        System.out.println("电梯上下运行起来...");
    }

    //单纯的停止，不考虑其他条件
    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
