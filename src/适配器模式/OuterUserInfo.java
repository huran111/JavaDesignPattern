package 适配器模式;

import java.util.Map;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 16:39 2018/7/3
 * @Modified By:
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();//员工的基本信息
    private Map homeInfo = super.getUserHomeInfo();//员工的家庭信息
    private Map officeInfo = super.getUserOfficeInfo(); //工作信息

    @Override
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    /*       * 家庭地址      */
    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /*       * 家庭电话号码      */
    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    /*       *职位信息      */
    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /*       * 手机号码      */
    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /*       * 办公电话      */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumbe");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }


}
