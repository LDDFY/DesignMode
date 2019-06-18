package chainor;

import java.math.BigDecimal;

/**
 * 责任链模式测试类
 *
 * @author LDDFY
 */
public class ChainOfResTest {
    public static void main(String[] args) {
        DeptHandler deptHandler = new DeptHandler();
        ProjectHandler projectHandler = new ProjectHandler();

        deptHandler.setNextHandler(projectHandler);

        deptHandler.doHandler("jj", new BigDecimal(2000));
        deptHandler.doHandler("jj", new BigDecimal(300));
        deptHandler.doHandler("qq", new BigDecimal(2000));
        deptHandler.doHandler("zzh", new BigDecimal(13000));
        deptHandler.doHandler("qq", new BigDecimal(18000));
    }
}
