package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface<_>{
    private List g;

    public Group() {
        // throw new UnsupportedOperationException("Method not yet implemented");
        g = new LinkedList<>();
    }

    public Integer count() {
        return g.size();
    }

    public void insert(_ value) {
        g.add(value);
    }

    public Boolean has(_ value) {
        return g.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return (_) g.get(indexOfValue);
    }

    public void delete(_ value) {
        g.remove(value);
    }

    public void clear() {
        g.clear();
    }

    public Iterator<_> iterator() {
        return g.iterator();
    }
}
