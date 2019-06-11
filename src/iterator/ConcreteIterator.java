package iterator;

import java.util.Collections;
import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Object> list = Collections.emptyList();
    private int current = 0;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(current++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (current == list.size()) {
            return false;
        }
        return true;
    }
}
