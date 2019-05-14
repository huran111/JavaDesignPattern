package HeadFirst.demo1;

/**
 * @author 胡冉
 * @ClassName RedheadDuck
 * @Date 2019/5/14 17:50
 * @Version 2.0
 */
public class RedheadDuck extends Duck {
    @Override
    public String quack() {
        return super.quack();
    }

    @Override
    public String swim() {
        return super.swim();
    }

    @Override
    String display() {
        return "红色";
    }

    @Override
    public String fly() {
        return super.fly();
    }
}
