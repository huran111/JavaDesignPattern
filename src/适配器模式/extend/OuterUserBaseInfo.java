package 适配器模式.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 19:01 2018/7/3
 * @Modified By:
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("mobileNumber", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
