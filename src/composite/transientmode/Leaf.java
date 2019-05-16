/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Leaf
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package composite.transientmode;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 叶子节点
 *
 * @author changhao
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }


    @Override
    @Deprecated
    protected void add(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持添加子节点...\t\n");
    }

    @Override
    @Deprecated
    protected void remove(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持删除子节点...\t\n");
    }

    @Override
    protected void operation(int depth) {
        System.out.println(StringUtils.repeat(SPLIT, depth).concat(this.name));
    }

    @Override
    @Deprecated
    protected List<Component> getChildren() {
        throw new UnsupportedOperationException("叶子节点不存在子节点信息...\t\n");
    }
}
