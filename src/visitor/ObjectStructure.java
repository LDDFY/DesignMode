/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	ObjectStructure
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 对象结构角色
 * 
 * @author changhao
 */
public class ObjectStructure {
  public static List<Element> getList() {
    List<Element> list = new ArrayList<>();
    Random ran = new Random();
    for (int i = 0; i < 10; i++) {
      int a = ran.nextInt(100);
      if (a > 50) {
        list.add(new ConcreteElement1());
      } else {
        list.add(new ConcreteElement2());
      }
    }
    return list;
  }
}
