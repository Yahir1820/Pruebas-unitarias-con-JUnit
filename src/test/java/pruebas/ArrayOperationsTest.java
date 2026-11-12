package pruebas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void numZerosSinCerosYRecibe0() {
        int[] x = {1, 2, 3};
        ArrayOperations a = new ArrayOperations();
        int zeros = a.numZero(x);
        assertEquals(0,zeros);
    }

    @Test
    void numZerosCon3CerosYRecibe3() {
        int[] x = {0, 0, 15, 03, 1, 100, 0};
        ArrayOperations a = new ArrayOperations();
        int zeros = a.numZero(x);
        assertEquals(3,zeros);
    }

    @Test
    void numZerosConArrayNULLTiraNullPointerException() {
        int[] x = null;
        ArrayOperations a = new ArrayOperations();
        assertThrows(NullPointerException.class, () -> a.numZero(x));
    }

    @Test
    void numZerosCon5CerosYRecibe4() {
        int[] x = {0, 0, 0, 0, 0, 1};
        ArrayOperations a = new ArrayOperations();
        int zeros = a.numZero(x);
        assertEquals(4, zeros);
    }

    @Test
    void numZerosSinNumsRecibe0() {
        int[] x = {};
        ArrayOperations a = new ArrayOperations();
        int zeros = a.numZero(x);
        assertEquals(0,zeros);
    }
}