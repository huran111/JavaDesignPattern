package 装饰者模式;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 10:40 2018/7/4
 * @Modified By:
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    private void reportHightScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    //在老爸看完毕成绩单后，我再汇报学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        this.reportHightScore();
        super.report();
        this.reportSort();
    }
}
