/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ConcreteBuilder
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package builder;

/**
 * 具体建造者
 *
 * @author changhao
 */
public class ConcreteBuilder implements Builder {

    private Plane plane;

    public ConcreteBuilder() {
        plane = new Plane();
    }

    @Override
    public void buildeWheel() {
        System.out.println("安装轮子...\t\n");
        plane.setWheel("轮子");
    }

    @Override
    public void buildeEngine() {
        System.out.println("安装引擎...\t\n");
        plane.setEngine("引擎");
    }

    @Override
    public void buildeStructure() {
        System.out.println("安装主题结构...\t\n");
        plane.setStructure("主题结构");
    }

    @Override
    public Plane builde() {
        return plane;
    }
}
