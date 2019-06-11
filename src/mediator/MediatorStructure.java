/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/11，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	MediatorStructure
 * 模块说明：
 * 修改历史：
 *  2019年-06月-11日  - changhao - 创建。
 */
package mediator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author changhao
 */
@Getter
@Setter
public class MediatorStructure implements Mediator {
  private HouseOwner houseOwner;
  private Tenant tenant;

  @Override
  public void contact(String message, Person person) {
    if (person == houseOwner) {
      tenant.getMessage(message);
    } else {
      houseOwner.getMessage(message);
    }
  }
}
