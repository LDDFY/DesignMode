package prototype;

/**
 * 原型模式测试类
 *
 * @author changhao
 */
public class PrototypeTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    ProtoType type = new ProtoType();
    type.setCode("code");
    type.setName("name");
    ProtoType clone = type.clone();

    System.out.println(type == clone);
    System.out.println(type.getClass() == clone.getClass());

    clone.setName("B");
    clone.setCode("B");
    System.out.println(type == clone);
  }

}
