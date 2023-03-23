public class SimpleLinkedListWrapper<T> implements SimpleList<T> {
    private Node<T> head, tail;
    private int size;
    public SimpleLinkedListWrapper() {
        head = tail = null;
        size =0;
    }

    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
            next = null;
        }
    }
    @Override
    public int size() {
        return size;
    }


    @Override
    public void add(T value) {
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

    @Override
    public void remove(int index) {
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
