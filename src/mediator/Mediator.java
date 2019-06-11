/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/11，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Mediator
 * 模块说明：
 * 修改历史：
 *  2019年-06月-11日  - changhao - 创建。
 */
package mediator;

/**
 * 抽象中介者
 *
 * @author changhao
 */
public interface Mediator {

    /**
     * 联系信息
     *
     * @param message
     * @param person
     */
    void contact(String message, Person person);
}
