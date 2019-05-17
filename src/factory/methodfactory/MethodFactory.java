package factory.methodfactory;

/**
 * 工厂方法基础类
 */
public abstract class MethodFactory {

  /**
   * 抽象创建方法
   *
   * @return
   */
  protected abstract Product create();
}
