package Colas;

/**
 *
 * @author roilanrodriguez55
 * @param <E>
 */
public interface Cola<E> {
    void add(E item);
    E peek();
    E poll();
    boolean isEmpty();
}
