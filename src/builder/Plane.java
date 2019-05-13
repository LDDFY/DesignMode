/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Plane
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package builder;

import lombok.Data;
import lombok.ToString;

/**
 * 飞机
 *
 * @author changhao
 */

@Data
@ToString
public class Plane {
    //轮子
    private String wheel;
    //引擎
    private String engine;
    //结构
    private String structure;
}
