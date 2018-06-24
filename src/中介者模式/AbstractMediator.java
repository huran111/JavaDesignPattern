package 中介者模式;

/**
 * @author:HuRan
 * @Description:抽象中介者
 * @Date: Created in 12:45 2018/6/24
 * @Modified By:
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;
    public AbstractMediator(){
        purchase=new Purchase(this);
        sale=new Sale(this);
        stock=new Stock(this);
    }
    public abstract  void execute(String str,Object ...objects);
}
