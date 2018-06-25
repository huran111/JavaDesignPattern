package 依赖倒置原则;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:40 2018/6/25
 * @Modified By:
 */
public interface IDriver {
    void drive(ICar car);
    void drive();
    void setCar(ICar car);

}
