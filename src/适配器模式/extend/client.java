package 适配器模式.extend;

import 适配器模式.IUserInfo;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 19:08 2018/7/3
 * @Modified By:
 */
public class client {
    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo=new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo=new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo=new OuterUserOfficeInfo();
        //传递三个对象
        IUserInfo girl=new OuterUserInfo(baseInfo,homeInfo,officeInfo);
       System.out.println(girl.getMobileNumber());
    }
}
