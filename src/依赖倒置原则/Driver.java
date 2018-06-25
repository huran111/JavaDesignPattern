package 依赖倒置原则;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:43 2018/6/25
 * @Modified By:
 */
public class Driver implements IDriver {
    private ICar car;

    @Override
    public void drive(ICar car) {
        this.car = car;
    }

    @Override
    public void drive() {
        this.car.run();
    }

    @Override
    public void setCar(ICar car) {
        car.run();
    }
}
