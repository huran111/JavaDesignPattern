package 中介者模式;

import java.util.Random;

/**
 * @author:HuRan
 * @Description: 销售管理
 * @Date: Created in 12:36 2018/6/24
 * @Modified By:
 */
public class Sale extends AbstractColleague{
    Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void sellIBMComputer(int number){
      super.abstractMediator.execute("sale.sell",number);
    }
    public int getSaleStatus(){
        Random random=new Random(System.currentTimeMillis());
        int saleStatus=random.nextInt(100);
        System.out.println("电脑的销售请为:"+saleStatus);
        return saleStatus;
    }
    public void offSale(){
     super.abstractMediator.execute("sale.offsell");
    }
}
