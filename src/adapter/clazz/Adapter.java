/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Adapter
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package adapter.clazz;

import adapter.Adaptee;
import adapter.Target;

/**
 * 类适配器
 *
 * @author changhao
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("类适配器进行适配...\t\n");
        specificRequest();
        System.out.println("类适配器适配结束...\t\n");
    }
}
