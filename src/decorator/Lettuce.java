/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Lettuce
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package decorator;

import java.math.BigDecimal;

/**
 * 生菜装饰类
 *
 * @author changhao
 */
public class Lettuce extends Condiment {

	private final Pancake pancake;

	public Lettuce(Pancake pancake) {
		this.pancake = pancake;
	}

	@Override
	public String getName() {
		return pancake.getName().concat("，加生菜");
	}

	@Override
	public BigDecimal getPrice() {
		return pancake.getPrice().add(BigDecimal.valueOf(1));
	}
}
