package composite.demo1;

import java.util.Iterator;

/**
 * 设备基础抽象类（Component）
 *
 * @author changhao
 */
public abstract class Equipment {

	/**
	 * 设备名称
	 */
	private final String name;

	public Equipment(String name) {
		this.name = name;
	}

	/**
	 * 网络价格
	 *
	 * @return
	 */
	protected abstract double netPrice();

	/**
	 * 折扣价格
	 *
	 * @return
	 */
	protected abstract double discountPrice();

	/**
	 * 添加设备
	 *
	 * @param equipment
	 * @return
	 */
	protected abstract boolean add(Equipment equipment);

	/**
	 * 删除设备方法
	 *
	 * @param equipment
	 * @return
	 */
	protected abstract boolean remove(Equipment equipment);

	/**
	 * 访问设备方法
	 *
	 * @return
	 */
	protected abstract Iterator<Equipment> iterator();

}
