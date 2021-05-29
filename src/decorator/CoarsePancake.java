/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	CoarsePancake
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package decorator;

import java.math.BigDecimal;

/**
 * 杂粮煎饼
 *
 * @author changhao
 */
public class CoarsePancake extends Pancake {

  public CoarsePancake() {
    this.name = "杂粮煎饼";
  }

  @Override
  public BigDecimal getPrice() {
    return BigDecimal.valueOf(5.0);
  }
}
