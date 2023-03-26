import java.util.Enumeration;
import java.util.Iterator;

public class Iterador<E> implements Enumeration<E> {
    private Iterator<E> iterator;

    public Iterador(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public E nextElement() {
        return iterator.next();
    }
}
