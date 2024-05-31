package PointTask;

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

    public double distance(Point point){
        double distanceAB;
        double pointAx = this.pointX;
        double pointAy = this.pointY;
        double pointBx = point.pointX;
        double pointBy = point.pointY;


        //Рассчет расстояниия между двумя точками A(x,y) и B(x,y)
        distanceAB = sqrt(pow((pointBx - pointAx),2) + pow((pointAy - pointBy),2));

        return distanceAB;
    }
}
