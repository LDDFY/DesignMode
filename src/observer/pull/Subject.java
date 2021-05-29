/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Subject
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 拉模式抽象主题：subject
 *
 * @author changhao
 */
public abstract class Subject {

	private final List<Observer> list = new ArrayList<>();

	public void attach(Observer observer) {
		list.add(observer);
	}

	public void detach(Observer observer) {
		list.remove(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
