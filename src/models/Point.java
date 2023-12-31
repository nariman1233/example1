package models;

public class Point {
    private double x;
    private double y;

    public Point(double x , double y){
        this.setX(x);
        this.setY(y);

    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {

        return y;
    }

    public double distanceTo(Point point){
        return Math.sqrt((Math.pow(this.x - point.x , 2)) + Math.pow(this.y - point.y , 2));
    }
}
