package iterator;

/**
 * 抽象迭代器角色
 *
 * @author changhao
 */
public interface Iterator {
	/**
	 * 返回下一个对象
	 *
	 * @return
	 */
	Object next();

	/**
	 * 判断是否存在下一个对象
	 *
	 * @return
	 */
	boolean hasNext();
}
