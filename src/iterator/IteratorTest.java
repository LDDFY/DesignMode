package iterator;

/**
 * 迭代器模式测试类
 *
 * @author LDDFY
 */
public class IteratorTest {

	public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("a");
		ag.add("b");
		ag.add("c");
		ag.add("d");
		ag.add("e");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
