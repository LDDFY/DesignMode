/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	FlyWeight
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package flyweight.simple;

/**
 * 抽象享元角色：FlyWeight
 *
 * @author changhao
 */
public interface FlyWeight {
	/**
	 * 操作
	 *
	 * @param state 外部状态
	 */
	void operation(String state);
}
