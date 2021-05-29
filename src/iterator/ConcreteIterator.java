package iterator;

import java.util.List;

/**
 * 具体迭代器类实现
 *
 * @author LDDFY
 */
public class ConcreteIterator implements Iterator {

  private int current = 0;
	private final List<Object> list;

	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	@Override
	public Object next() {
		Object obj = null;
		if (hasNext()) {
			obj = list.get(current++);
		}
		return obj;
	}

	@Override
	public boolean hasNext() {
		if (current == list.size()) {
			return false;
		}
		return true;
	}
}
