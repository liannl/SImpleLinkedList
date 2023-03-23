/**
 * Класс описывающий список
 * */
public class SimpleLinkedListWrapper<T> implements SimpleList<T> {
    /**  Поля хранящие начало и конец списка*/
    private Node<T> head, tail;
    /** Поле размер списка */
    private int size;

    /** Конструктор - создание нового объекта*/
    public SimpleLinkedListWrapper() {
        head = tail = null;
        size =0;
    }

    /** Класс узла */
    private static class Node<T>{
        /** Поле данные*/
        T data;
        /** Поле указатель на следующий узел*/
        Node<T> next;

        /** Конструктор - создание нового объекта*/
        Node(final T data){
            this.data = data;
            next = null;
        }
    }

    /** Функция возвращающая количество элементов в списке
     * @return размер списка
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Процедура добавления элемента в конец списока
     * @param value - даннае
     */
    @Override
    public void add(final T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null){
            head = tail = newNode;
        } else {
            Node<T> current = tail;
            current.next = newNode;
            tail = current.next;
        }
        size++;
    }

    /**
     * Процедура удаления элемента из списка по индексу
     * @param index - индекс
     */
    @Override
    public void remove(final int index) {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            head = head.next;
        }else {
            Node<T> current = head;
            for (int i = 0;i<index -1 ;i++){
                current = current.next;
            }
            if (index == size-1){
                tail = current;
            }
            current.next = current.next.next;
        }
        size--;
    }

    /** Процедура вывода списка*/
    @Override
    public void print() {
        Node<T> current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
