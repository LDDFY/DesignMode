package builder;

/**
 * 飞机建造接口
 *
 * @author changhao
 */
public interface Builder {
  /**
   * 安装轮子
   */
  void buildeWheel();

  /**
   * 安装引擎
   */
  void buildeEngine();

  /**
   * 组装整体结构
   */
  void buildeStructure();

  /**
   * 生成对象
   *
   * @return
   */
  Plane builde();
}
