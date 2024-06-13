package OddTaskTest;

import OddTask.OddTask;
import org.junit.jupiter.api.*;

public class OddTaskTest {

    @Test
    @DisplayName("Метод проверяет получение True (четное)")
    public void isOddTestEven(){

        boolean result;
        result = OddTask.isOdd(4);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Метод проверяет получение false (не четное)")
    public void isOddTestEvenNegative(){

        boolean result;
        result = OddTask.isOdd(3);
        Assertions.assertFalse(result);
    }
}
