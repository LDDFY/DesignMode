/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Pancake
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package decorator;

import java.math.BigDecimal;

/**
 * 抽象类：煎饼
 *
 * @author changhao
 */
public abstract class Pancake {
    protected String name;

    /**
     * 获取名称
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * 获取价格
     *
     * @return
     */
    public abstract BigDecimal getPrice();
}
