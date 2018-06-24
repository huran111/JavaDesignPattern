package 代理模式2;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:02 2018/6/24
 * @Modified By:
 */
public class ManSayHelloWorld implements ISayHelloWorld {
    @Override
    public String say() {
        System.out.println("hello world");
        return "MAN";
    }
}
