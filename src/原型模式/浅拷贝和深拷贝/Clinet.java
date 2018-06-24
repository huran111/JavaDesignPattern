package 原型模式.浅拷贝和深拷贝;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:24 2018/6/24
 * @Modified By:
 */
public class Clinet {
    public static void main(String[] args) throws CloneNotSupportedException {
        Thing thing=new Thing();
        thing.setValue("a");
        Thing clone = thing.clone();
        clone.setValue("b");
        System.out.println(thing.getValue());
    }
}
