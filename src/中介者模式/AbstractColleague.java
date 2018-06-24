package 中介者模式;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:55 2018/6/24
 * @Modified By:
 */
public abstract class AbstractColleague {
    protected AbstractMediator abstractMediator;
    AbstractColleague(AbstractMediator abstractMediator){
        this.abstractMediator=abstractMediator;
    }
}
