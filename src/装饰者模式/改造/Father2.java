package 装饰者模式.改造;

import 装饰者模式.FouthGradeSchoolReport;
import 装饰者模式.SchoolReport;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 11:10 2018/7/4
 * @Modified By:
 */
public class Father2 {
    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr;
        //原装的成绩单
        sr = new FouthGradeSchoolReport();
        //加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        //又加了排名的说明
        sr = new SortDecorator(sr);
        //看成绩单
        sr.report();
        sr.sign("胡冉");


    }
}
