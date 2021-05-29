/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/27，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Caretaker
 * 模块说明：
 * 修改历史：
 *  2019年-05月-27日  - wwwch - 创建。
 */
package memento;

/**
 * Caretaker:管理人
 *
 * @author wwwch
 */
public class Caretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
