
import models.Point;
import models.Shape;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Пользователь\\IdeaProjects\\untitled2\\src\\source.txt");

        Scanner in = new Scanner(file);
      Shape shape = new Shape();

      while(in.hasNext()){
          double x = in.nextDouble();
          double y = in.nextDouble();

          Point point = new Point(x , y);
          shape.addPoint(point);
      }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongestSide());
     
    }

}