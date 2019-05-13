/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Director
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package builder;

/**
 * 指导者，处理具体的创建步骤和逻辑
 *
 * @author changhao
 */
public class Director {

    public Plane construct(Builder builder) {
        System.out.println("指导者开始组装飞机部件...\n\t");
        builder.buildeEngine();
        builder.buildeWheel();
        builder.buildeStructure();
        System.out.println("指导者组装完成...\n\t");
        return builder.builde();
    }
}
