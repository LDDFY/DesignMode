package facade;

/**
 * 门面模式测试类
 *
 * @author changhao
 */
public class FacadeTest {

    public static void main(String[] args) {
        FacadeHead facadeHead = new FacadeHead();
        facadeHead.explainWords("你在干吗？");
    }
}
