/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	FlyWeightFactory
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package flyweight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 *
 * @author changhao
 */
public class FlyWeightFactory {

	private static final Map<String, ConcreteFlyWeight> FLY_WEIGHTS = new HashMap<>(128);

	public ConcreteFlyWeight factory(String str) {
		ConcreteFlyWeight flyweight = FLY_WEIGHTS.get(str);
		if (null == flyweight) {
			flyweight = new ConcreteFlyWeight(str);
			FLY_WEIGHTS.put(str, flyweight);
		}
		return flyweight;
	}

	public int size() {
		return FLY_WEIGHTS.size();
	}
}
