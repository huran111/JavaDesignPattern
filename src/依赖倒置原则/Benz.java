package 依赖倒置原则;

import javax.swing.*;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 11:42 2018/6/25
 * @Modified By:
 */
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰车开始运行");
    }
}
