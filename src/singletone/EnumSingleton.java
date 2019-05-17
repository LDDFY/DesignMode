/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/8，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	EnumSingleton
 * 模块说明：
 * 修改历史：
 *  2019年-05月-08日  - changhao - 创建。
 */
package singletone;

/**
 * 枚举
 *
 * @author changhao
 */
public enum EnumSingleton {
    /**
     * 用于初始化单例实例
     */
    INSTANCE;

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("枚举式 doSomething ...");
    }
}
