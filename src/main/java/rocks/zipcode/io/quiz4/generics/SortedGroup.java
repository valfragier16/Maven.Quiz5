package rocks.zipcode.io.quiz4.generics;

import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {

    private List sg;
    public SortedGroup() {
        // throw new UnsupportedOperationException("Method not yet implemented");
        sg = new LinkedList<>();
    }
    @Override
    public void insert(_ value) {
        this.sg.add(value);
        this.sg.sort((object1 ,object2)->{if (object1 instanceof Comparable) {
            return ((Comparable)object1).compareTo(object2);
        }
        else return 0;});
    }

    @Override
    public void delete(_ value) {
        sg.remove(value);
    }

    public Integer indexOf(_ value) {
        return sg.indexOf(value);
    }

}
