package PointTaskTest;

import ru.ls.qa.school.core.PointTask.Point;
import org.junit.jupiter.api.*;
import static PointTaskTest.PointConstants.*;

public class PointTaskTest {

    Point pointA = new Point(42.000,64.0000);
    Point pointB = new Point(9.9284,61.9442);

    @Test
    @DisplayName("Позитивная проверка расчета растояния м/у точками")
    public void distancePositiveTest(){
        Assertions.assertEquals(CONSTANT_RESULT,pointA.distance(pointB));
    }

    @Test
    @DisplayName("Позитивная проверка вывода координат точки")
    public void pointToStringPositiveTest(){
        Assertions.assertEquals(CONSTANT_POINT_A, pointA.toString());
    }
}
