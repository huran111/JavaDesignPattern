package 装饰者模式.改造;

import 装饰者模式.SchoolReport;


/**
 * @author:HuRan
 * @Description: 修饰的抽象类
 * @Date: Created in 10:59 2018/7/4
 * @Modified By:
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
