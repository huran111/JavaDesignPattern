package 适配器模式;

import java.util.Map;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 16:32 2018/7/3
 * @Modified By:
 */
public interface IOuterUser {
    //基本信息，比如名称、性别、手机号码等
    Map getUserBaseInfo();

    // 工作区域信息
    Map getUserOfficeInfo();

    //用户的家庭信息
    Map getUserHomeInfo();
}
