import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MassTest {
    int Count = 5;
    int Mass[] = new int[]{1,2, 3, 4, 5};
    @Test
    void clVector() {
    Mass mass = new Mass();
        int actual = mass.clVector(Count,Mass);
    assertEquals(Count,actual);

    }

    @Test
    void max() {
        Mass mass = new Mass();
        int actual = mass.Max(Count,Mass);
        assertEquals(5,actual);
    }
    @Test
    void Min() {
        Mass mass = new Mass();
        int actual = mass.Min(Count,Mass);
        assertEquals(1,actual);
    }

    @Test
    void index() {
        Mass mass = new Mass();
        int actual = mass.index(Count,Mass);
        assertEquals(4,actual);
    }
}