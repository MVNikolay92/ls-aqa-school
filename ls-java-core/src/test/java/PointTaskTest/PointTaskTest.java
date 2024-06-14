package PointTaskTest;

import ru.ls.qa.school.core.PointTask.Point;
import org.junit.jupiter.api.*;

public class PointTaskTest {

    Point pointA = new Point(42.000,64.0000);
    Point pointB = new Point(9.9284,61.9442);
    double result = 32.13742118154474;


    @Test
    @DisplayName("Позитивная проверка расчета растояния м/у точками")
    public void distancePositiveTest(){
        Assertions.assertEquals(result,pointA.distance(pointB));
    }
}
