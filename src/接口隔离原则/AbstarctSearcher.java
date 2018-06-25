package 接口隔离原则;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:26 2018/6/25
 * @Modified By:
 */
public abstract class AbstarctSearcher {
    protected IPettyGirl pettyGirl;

    AbstarctSearcher(IPettyGirl _perttyGIrl) {
        this.pettyGirl = _perttyGIrl;
    }

    abstract void show();
}
