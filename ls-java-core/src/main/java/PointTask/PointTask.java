package PointTask;

public class PointTask {
    public static void main(String[] args) {

        Point pointA = new Point();
        Point pointB = new Point();

        //Заполнение координат точки А(x,y)
        System.out.println("Введите значений точки А(x,y).\nДопусткается ввод с разделителем \",\" (5,8870).");
        pointA.MethodOfEnteringCoordinatesPoint();
        System.out.println(pointA.toString());

        //Заполнение координат точки B(x,y)
        System.out.println("Введите значений точки B(x,y).\nДопусткается ввод с разделителем \",\" (5,8870). ");
        pointB.MethodOfEnteringCoordinatesPoint();
        System.out.println(pointB.toString());

        System.out.println("Вывод расстояния между точками A и B: " +
              pointA.distance(pointB));
    }
}