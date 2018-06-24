package 中介者模式;

/**
 * @author:HuRan
 * @Description: 具体中介者
 * @Date: Created in 12:48 2018/6/24
 * @Modified By:
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("pruchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int salestatus = super.sale.getSaleStatus();
        if (salestatus > 80) {
            System.out.println("采购IBM电脑" + number + "台");
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑" + number + "台");
            stock.increase(number);
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑:" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
