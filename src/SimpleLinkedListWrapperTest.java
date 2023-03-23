import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleLinkedListWrapperTest {
    @Test
    public void testAdd() {
        SimpleList<Integer> list = new SimpleLinkedListWrapper<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testRemove() {
        SimpleList<Integer> list = new SimpleLinkedListWrapper<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        assertEquals(2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexOutOfBounds() {
        SimpleList<Integer> list = new SimpleLinkedListWrapper<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(3);
    }
}