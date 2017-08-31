package composite.demo1;

import java.util.Iterator;

public abstract class Equipment {

	private String name;

	public Equipment(String name) {
		this.name = name;
	}

	// 网络价格
	public abstract double netPrice();

	// 折扣价格
	public abstract double discountPrice();

	// 添加部件方法
	public boolean add(Equipment equipment) {
		System.out.println(name+":");
		return false;
	}

	// 删除部件方法
	public boolean remove(Equipment equipment) {
		return false;
	}

	// 访问组合体类方法
	public Iterator<Equipment> iterator() {
		return null;
	}

}
