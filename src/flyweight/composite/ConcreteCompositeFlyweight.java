/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ConcreteCompositeFlyweight
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package flyweight.composite;

import flyweight.simple.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 组合享元角色
 *
 * @author changhao
 */
public class ConcreteCompositeFlyweight implements FlyWeight {

	private final Map<String, FlyWeight> FLY_WEIGHTS = new HashMap<>();

	@Override
	public void operation(String state) {
		for (String s : FLY_WEIGHTS.keySet()) {
			FLY_WEIGHTS.get(s).operation(state);
		}
	}

	public void add(String key, FlyWeight fly) {
		FLY_WEIGHTS.put(key, fly);
	}
}
