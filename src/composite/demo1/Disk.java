package composite.demo1;

import java.util.Iterator;

/**
 * 硬盘设备
 */
public class Disk extends Equipment {

    public Disk(String name) {
        super(name);
    }

    @Override
    public double netPrice() {
        return 1.5;
    }

    @Override
    public double discountPrice() {
        return 0.5;
    }

    @Override
    protected boolean add(Equipment equipment) {
        throw new UnsupportedOperationException("具体设备不支持此操作...\t\n");
    }

    @Override
    protected boolean remove(Equipment equipment) {
        throw new UnsupportedOperationException("具体设备不支持此操作...\t\n");
    }

    @Override
    protected Iterator<Equipment> iterator() {
        throw new UnsupportedOperationException("具体设备不支持此操作...\t\n");
    }
}
