package HeadFirst.demo1;

/**
 * @author 胡冉
 * @ClassName MallardDuck
 * @Description: TODO
 * @Date 2019/5/14 17:49
 * @Version 2.0
 */
public class MallardDuck extends Duck {
    @Override
    String display() {
        return "绿色";
    }

    @Override
    public String quack() {
        return super.quack();
    }

    @Override
    public String swim() {
        return super.swim();
    }

    @Override
    public String fly() {
        return super.fly();
    }
}
