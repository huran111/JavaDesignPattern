package 装饰者模式;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 19:24 2018/7/3
 * @Modified By:
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr=new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("胡冉");
    }
}
