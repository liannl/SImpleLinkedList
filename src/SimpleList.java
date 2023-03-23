public interface SimpleList<T> {
    int size();
    T get(int index);
    void add(T value);
    void remove(int index);
    void print();
}
