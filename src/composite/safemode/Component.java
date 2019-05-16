/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Component
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package composite.safemode;

/**
 * 安全模式：
 * <p>
 * 共有组件Component
 *
 * @author changhao
 */
public abstract class Component {
    public static final String SPLIT = "-->";

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 共有操作
     *
     * @param depth
     */
    protected abstract void operation(int depth);
}
