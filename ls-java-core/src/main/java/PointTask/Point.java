package PointTask;

import java.util.Scanner;
import static java.lang.Math.*;

public class Point {
    double pointX;
    double pointY;

    public Point() { }

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /***
     * Расчет расстояния между двумя точками
     * @param point - в качестве параметра передается переменная класса Point
     * @return расстояние между 2 точками
     ***/
    public double distance(Point point){

        double pointAx = this.pointX;
        double pointAy = this.pointY;
        double pointBx = point.getPointX();
        double pointBy = point.getPointY();

        //Рассчет расстояниия между двумя точками A(x,y) и B(x,y)
        return sqrt(pow((pointBx - pointAx),2) + pow((pointBy - pointAy),2));
    }

    public void MethodOfEnteringCoordinatesPoint() {

        double coordinateX, coordinateY;
        Scanner sc = new Scanner(System.in);
        try {
              System.out.print("Координата X = ");
              coordinateX = sc.nextDouble();
              this.setPointX(coordinateX);

              System.out.print("Координата Y = ");
              coordinateY = sc.nextDouble();
              this.setPointY(coordinateY);

        } catch (Exception e) {
              System.out.println("Сообщение об ошибке. " +
                      "\nВведено не корретное значение." +
                      "\nДопусткается ввод с разделителем \",\" (5,8870).");
        }
    }

    @Override
    public String toString()
    {
        return "Координаты точки: Point("+ this.pointX + ";" + this.pointY + ")";
    }
}
