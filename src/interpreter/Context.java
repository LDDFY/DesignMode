/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Context
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色：Context
 * 
 * @author changhao
 */
public class Context {
  private Map valueMap = new HashMap<>();

  /**
   * 添加值
   * 
   * @param x
   * @param y
   */
  public void addValue(Variable x, int y) {
    valueMap.put(x, y);
  }

  /**
   * 获取值
   * 
   * @param x
   * @return
   */
  public int lookupValue(Variable x) {
    return (int) valueMap.get(x);
  }
}
