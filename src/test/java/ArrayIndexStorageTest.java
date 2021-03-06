import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexStorageTest {

    ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(new int[]{5, 343, -433, 1531, 0, -99});

    @Test
    public void sizeOfArrayTest() {

        int actual = arrayIndexStorage.size();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void getIndexTest() {

        int actual = arrayIndexStorage.get(5);
        int expected = -99;

        assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {

        int actual[] = arrayIndexStorage.reverse();
        int expected[] = {-99, 0, 1531, -433, 343, 5};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void getIndexExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> arrayIndexStorage.get(6));
        assertThrows(IllegalArgumentException.class, () -> arrayIndexStorage.get(-1));
    }


}