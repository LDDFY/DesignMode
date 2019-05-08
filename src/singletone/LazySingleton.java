/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/8，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	LazySingleton
 * 模块说明：
 * 修改历史：
 *  2019年-05月-08日  - changhao - 创建。
 */
package singletone;

/**
 * 懒汉式
 *
 * @author changhao
 */
public class LazySingleton {
    public static LazySingleton instance = null;

    private LazySingleton() {
        //预防反射造成单例造成破坏
        if (instance != null) {
            throw new RuntimeException("不可使用构造方法实例化单例！");
        }
    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("懒汉式 doSomething ...");
    }
}
