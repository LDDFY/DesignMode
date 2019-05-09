/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	CglibRealSubject
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy.cglib;

import proxy.base.RealSubject;

/**
 * Cglib 类
 *
 * @author changhao
 */
public class CglibRealSubject extends RealSubject {

    /**
     * 用于检验Cglib是通过类继承方式实现代理的
     */
    public void doAnotherThing() {
        System.out.println("CglibRealSubject do anotherThing...\t\n");
    }
}
