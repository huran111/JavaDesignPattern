package 接口隔离原则;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 11:29 2018/6/25
 * @Modified By:
 */
public class Searcher extends AbstarctSearcher{

    Searcher(IPettyGirl _perttyGIrl) {
        super(_perttyGIrl);
    }

    @Override
    void show() {
    System.out.println("美女的信息如下：");
    super.pettyGirl.goodLooking();
    super.pettyGirl.niceFigure();
    super.pettyGirl.greatTemperament();
    }
}
