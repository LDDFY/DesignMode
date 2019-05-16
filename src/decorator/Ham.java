/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Ham
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package decorator;

import java.math.BigDecimal;

/**
 * 火腿装饰类
 *
 * @author changhao
 */
public class Ham extends Condiment {
    private Pancake pancake;

    public Ham(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getName() {
        return pancake.getName().concat("，加火腿");
    }

    @Override
    public BigDecimal getPrice() {
        return pancake.getPrice().add(BigDecimal.valueOf(2));
    }
}
