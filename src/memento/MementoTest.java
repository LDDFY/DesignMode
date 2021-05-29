/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/27，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	MementoTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-27日  - wwwch - 创建。
 */
package memento;

/**
 * 备忘录测试类
 *
 * @author wwwch
 */
public class MementoTest {

	public static void main(String[] args) {
		// 原值
		Originator originator = new Originator();
		originator.setMagicValue(36);
		originator.setBloodValue(80);
		System.out.println("原值:");
		originator.disPlay();

		// 存档
		System.out.println("存档...");
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.saveMemento());

		// 修改原值
		originator.setMagicValue(26);
		originator.setBloodValue(50);
		System.out.println("修改后：");
		originator.disPlay();

		// 恢复存档
		System.out.println("恢复存档...");
		originator.resetStore(caretaker.getMemento());
		System.out.println("恢复后:");
		originator.disPlay();
	}
}
