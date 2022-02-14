import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class IndexStorageTest {

    IndexStorage indexStorage = new IndexStorage(10);

    @Test
    public void sizeOfArrayTest() {

        int actual = indexStorage.size();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/getIndexStorageTest.csv")
    public void getIndexTest(int index, int number) {

        int actual = indexStorage.get(index);
        int expected = number;

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