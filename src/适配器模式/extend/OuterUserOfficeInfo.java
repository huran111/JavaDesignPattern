package 适配器模式.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 18:58 2018/7/3
 * @Modified By:
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("mobileNumber", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
