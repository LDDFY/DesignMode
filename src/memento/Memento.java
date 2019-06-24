/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/27，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Memento
 * 模块说明：
 * 修改历史：
 *  2019年-05月-27日  - wwwch - 创建。
 */
package memento;

import lombok.Data;

/**
 * Memento:备忘录
 *
 * @author wwwch
 */
@Data
public class Memento {
  /**
   * 血条
   */
  private int bloodValue;
  /**
   * 蓝条
   */
  private int magicValue;
}
