package composite.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CompositeEquipment extends Equipment {

	private int i = 0;
	private List<Equipment> equipments = new ArrayList<Equipment>();

	public CompositeEquipment(String name) {
		super(name);
	}

	public boolean add(Equipment e) {
		this.equipments.add(e);
		return true;
	}

	@Override
	public double netPrice() {
		double netPrice = 0.0;
		Iterator<Equipment> it = equipments.iterator();
		while (it.hasNext()) {
			netPrice += it.next().netPrice();
		}
		return netPrice;
	}

	@Override
	public double discountPrice() {
		double discountPrice = 0.0;
		Iterator<Equipment> it = equipments.iterator();
		while (it.hasNext()) {
			discountPrice += it.next().discountPrice();
		}
		return discountPrice;
	}

	@Override
	public Iterator<Equipment> iterator() {
		// TODO Auto-generated method stub
		return equipments.iterator();
	}

	public boolean hasNext() {
		return i < equipments.size();
	}

	public Object next() {
		
		if (hasNext()) {
			return equipments.get(i++);
		} else {
			throw new NoSuchElementException();
		}
	}
}
