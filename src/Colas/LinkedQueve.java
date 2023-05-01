package Colas;

/**
 *
 * @author roilanrodriguez55
 * @param <E>
 */
public class LinkedQueve<E> implements Cola<E> {

    private Node<E> first, last;

    public LinkedQueve() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void add(E item) {
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) {
            last = newNode;
            first = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    @Override
    public E peek() {
        return !(isEmpty()) ? first.getInfo() : null;
    }

    @Override
    public E poll() {
        if (!(isEmpty())) {
            E item = first.getInfo();
            first = first.getNext();
            return item;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

}
