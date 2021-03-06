/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	FlyWeightCompositeFactory
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package flyweight.composite;

import flyweight.simple.ConcreteFlyWeight;
import flyweight.simple.FlyWeight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 组合享元模式工厂类
 *
 * @author changhao
 */
public class FlyWeightCompositeFactory {

	private final static Map<String, FlyWeight> FLY_WEIGHTS = new HashMap<>();

	public FlyWeight factory(List<String> compositeStates) {
		ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
		for (String s : compositeStates) {
			compositeFly.add(s, this.factory(s));
		}
		return compositeFly;
	}

	public FlyWeight factory(String s) {
		return FLY_WEIGHTS.computeIfAbsent(s, ConcreteFlyWeight::new);
	}
}
