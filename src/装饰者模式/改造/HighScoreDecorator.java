package 装饰者模式.改造;

import 装饰者模式.SchoolReport;

/**
 * @author:HuRan
 * @Description: 最高成绩修饰类
 * @Date: Created in 11:01 2018/7/4
 * @Modified By:
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    //我要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抡起扫帚揍我，我哪里还有机会说啊
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
