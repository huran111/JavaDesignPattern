package 中介者模式;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:43 2018/6/24
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
       AbstractMediator abstractMediator=new Mediator();
       Purchase purchase=new Purchase(abstractMediator);
       purchase.buyIBMcomputer(100);
       Sale sale=new Sale(abstractMediator);
       sale.sellIBMComputer(1);
       Stock stock=new Stock(abstractMediator);
       stock.clearStock();
    }
}
