package models;

import models.Point;

import java.util.ArrayList;

public class Shape {

    private ArrayList<Point> pointList = new ArrayList<>();

    public void addPoint(Point point) {
        pointList.add(point);
    }
       public double  calculatePerimeter(){
            double perimeter = 0;
            int size = pointList.size();
            for (int i=0; i< size - 1; i++){
                perimeter+=pointList.get(i).distanceTo(pointList.get(i+1));
            }

            return perimeter + pointList.getLast().distanceTo(pointList.getFirst());
       }

        public double getAverageSide(){

          return calculatePerimeter() / pointList.size();
        }

        public double getLongestSide(){
        double max = -999999;
            int size = pointList.size();
            for (int i = 0; i < size - 1; i++) {
                if(pointList.get(i).distanceTo(pointList.get(i+1)) > max){
                    max = pointList.get(i).distanceTo(pointList.get(i+1));
                }
            }
            return max;
        }


}
