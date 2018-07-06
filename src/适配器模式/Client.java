package 适配器模式;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 16:47 2018/7/3
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo girl=new UserInfo();
        for(int i=0;i<10;i++){
            girl.getMobileNumber();
        }
       IUserInfo youngGirl= new OuterUserInfo();
        for(int i=0;i<10;i++){
            youngGirl.getMobileNumber();
        }
    }
}
