package 中介者模式;

/**
 * @author:HuRan
 * @Description: 采购管理
 * @Date: Created in 12:35 2018/6/24
 * @Modified By:
 */
public class Purchase extends AbstractColleague{

    Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    public  void buyIBMcomputer(int number){
        super.abstractMediator.execute("purchase.buy",number);
    }
    public void refuseBuyIBM(){
        System.out.println("不买了");
    }
}
