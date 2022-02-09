import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexStorageTest {

    IndexStorage indexStorage = new IndexStorage(10);

    @Test
    public void sizeOfArrayTest() {

        int actual = indexStorage.size();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void getIndexTest() {

        int actual = indexStorage.get(5);
        int expected = -5;

        assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {

        int actual[] = indexStorage.reverse();
        int expected[] = {-9, 8, -7, 6, -5, 4, -3, 2, -1, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void createExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> new IndexStorage(-1));
    }

    @Test
    public void getIndexExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> indexStorage.get(10));
        assertThrows(IllegalArgumentException.class, () -> indexStorage.get(-1));
    }

}