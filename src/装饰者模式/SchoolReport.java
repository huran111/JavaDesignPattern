package 装饰者模式;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 19:19 2018/7/3
 * @Modified By:
 */
public abstract class SchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();

    // 成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
