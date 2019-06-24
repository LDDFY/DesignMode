/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ProtoType
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package prototype;

import lombok.Data;
import lombok.ToString;

/**
 * 原型
 *
 * @author changhao
 */
@Data
@ToString
public class ProtoType implements Cloneable {

  private String name;
  private String code;

  @Override
  protected ProtoType clone() throws CloneNotSupportedException {
    return (ProtoType) super.clone();
  }
}
