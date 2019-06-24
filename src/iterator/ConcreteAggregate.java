package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器角色
 *
 * @author LDDFY
 */
public class ConcreteAggregate implements Aggregate {

  private List<Object> list = new ArrayList<>();

  @Override
  public void add(Object obj) {
    list.add(obj);
  }

  @Override
  public void remove(Object obj) {
    list.remove(obj);
  }

  @Override
  public Iterator iterator() {
    return new ConcreteIterator(list);
  }
}
