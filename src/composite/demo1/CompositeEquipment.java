package composite.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 设备组合类
 *
 * @author changhao
 */
public class CompositeEquipment extends Equipment {

  private List<Equipment> equipments;

  public CompositeEquipment(String name) {
    super(name);
    equipments = new ArrayList<>();
  }

  @Override
  public boolean add(Equipment e) {
    return this.equipments.add(e);
  }

  @Override
  protected boolean remove(Equipment equipment) {
    return this.equipments.remove(equipment);
  }

  @Override
  public double netPrice() {
    double sum = 0.0;
    Iterator<Equipment> it = iterator();
    while (it.hasNext()) {
      sum += it.next().netPrice();
    }
    return sum;
  }

  @Override
  public double discountPrice() {
    double sum = 0.0;
    Iterator<Equipment> it = iterator();
    while (it.hasNext()) {
      sum += it.next().discountPrice();
    }
    return sum;
  }

  @Override
  public Iterator<Equipment> iterator() {
    return equipments.iterator();
  }
}
