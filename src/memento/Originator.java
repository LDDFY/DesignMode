/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/27，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Originator
 * 模块说明：
 * 修改历史：
 *  2019年-05月-27日  - wwwch - 创建。
 */
package memento;

import lombok.Getter;
import lombok.Setter;

/**
 * 原发器Originator: 发起人
 *
 * @author wwwch
 */
@Getter
@Setter
public class Originator {
	/**
	 * 血条
	 */
	private int bloodValue;
	/**
	 * 蓝条
	 */
	private int magicValue;

	public void disPlay() {
		System.out.println("血条：" + getBloodValue());
		System.out.println("蓝条：" + getMagicValue());
	}

	public Memento saveMemento() {
		Memento memento = new Memento();
		memento.setBloodValue(getBloodValue());
		memento.setMagicValue(getMagicValue());
		return memento;
	}

	public void resetStore(Memento memento) {
		setBloodValue(memento.getBloodValue());
		setMagicValue(memento.getMagicValue());
	}
}
