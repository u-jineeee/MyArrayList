import com.ll.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList<String> list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    void testAdd() {
        assertTrue(list.add("Element1"));
        assertEquals(1, list.size());
        assertEquals("Element1", list.get(0));
    }

    @Test
    void testSize() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        assertEquals(3, list.size());
    }

    @Test
    void testGet() {
        list.add("Element1");
        list.add("Element2");
        assertEquals("Element1", list.get(0));
        assertEquals("Element2", list.get(1));
    }
}
