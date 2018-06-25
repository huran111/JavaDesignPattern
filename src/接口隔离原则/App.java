package 接口隔离原则;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:30 2018/6/25
 * @Modified By:
 */
public class App {
    public static void main(String[] args) {
        IPettyGirl yanyan=new PettyGirl("大表哥");
        AbstarctSearcher searcher=new Searcher(yanyan);
        searcher.show();
    }
}
