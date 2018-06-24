package 中介者模式;

/**
 * @author:HuRan
 * @Description:库存管理
 * @Date: Created in 12:31 2018/6/24
 * @Modified By:
 */
public class Stock extends AbstractColleague{
    private static int COMPUTER_NUMBER=100;

    Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER=COMPUTER_NUMBER+number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }
    public void  decrease(int number){
        COMPUTER_NUMBER=COMPUTER_NUMBER-number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }
    public void clearStock(){
super.abstractMediator.execute("stock.clear");
    }
}
