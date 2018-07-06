package 适配器模式;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 16:24 2018/7/3
 * @Modified By:
 */
public interface IUserInfo {
    //获得用户姓名
     String getUserName();
    //获得家庭地址
     String getHomeAddress();
    //手机号码，这个太重要，手机泛滥啊
     String getMobileNumber();
    //这个人的职位是什么
     String getJobPosition();
    //获得家庭电话，这有点不好我不喜欢家庭电话讨论工作
     String getHomeTelNumber();
}
