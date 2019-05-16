/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	PancakeTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package decorator;

/**
 * 装饰类测试
 *
 * @author changhao
 */
public class PancakeTest {
    public static void main(String[] args) {
        //杂粮煎饼
        Pancake pancake = new CoarsePancake();
        //加鸡蛋
        Condiment egg = new Egg(pancake);
        //加火腿
        Condiment ham = new Ham(egg);
        //输出当前装饰信息
        ham.sold();
        //加生菜
        Condiment lettuce = new Lettuce(ham);
        //输出当前装饰信息
        lettuce.sold();
    }
}
