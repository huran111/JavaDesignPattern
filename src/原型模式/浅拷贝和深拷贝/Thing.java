package 原型模式.浅拷贝和深拷贝;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:HuRan
 * @Description:  浅拷贝
 * @Date: Created in 12:21 2018/6/24
 * @Modified By:
 */
public class Thing implements Cloneable {
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public Thing clone() throws CloneNotSupportedException {
        Thing thing = null;
        thing = (Thing) super.clone();
        thing.list= (ArrayList<String>) this.list.clone();
        return thing;
    }

    public void setValue(String value) {
        this.list.add(value);
    }

    public List<String> getValue() {
        return this.list;
    }

}
