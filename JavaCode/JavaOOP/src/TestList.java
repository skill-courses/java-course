public class TestList<E> {
    E[] elements;
    public E get(int index) {
        return elements[index];
    }
    public void add(E element) {
        elements[size()] = element;
    }
    public int size() {
        return elements.length;
    }
}
