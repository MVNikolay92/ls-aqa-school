package OddTaskTest;

import OddTask.OddTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddTaskTest {
    @Test
    public void isOddTestEven(){

        boolean result;
        result = OddTask.isOdd(4);
        Assertions.assertTrue(result);
    }
}
