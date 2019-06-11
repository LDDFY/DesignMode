package iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("zzh");
        ag.add("jj");
        ag.add("qq");
        Iterator it = ag.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
