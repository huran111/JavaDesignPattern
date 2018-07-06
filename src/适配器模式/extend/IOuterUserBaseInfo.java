package 适配器模式.extend;

import java.util.Map;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 16:56 2018/7/3
 * @Modified By:
 */
public interface IOuterUserBaseInfo {
    //基本信息，比如名称、性别、手机号码等
    public Map getUserBaseInfo();
}
