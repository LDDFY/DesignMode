package iterator;

/**
 * 抽象容器角色
 *
 * @author LDDFY
 */
public interface Aggregate {
  /**
   * 添加对象
   * 
   * @param obj
   */
  void add(Object obj);

  /**
   * 删除对象
   * 
   * @param obj
   */
  void remove(Object obj);

  /**
   * 对象迭代器
   * 
   * @return
   */
  Iterator iterator();
}
