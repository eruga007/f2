import java.sql.Array;
import java.util.ArrayList;


 
public class Main{
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rec("g",2,3));
        shapes.add(new Circle("h",4));
        shapes.add(new Circle("d",5));
        double[] total  = new double[3];
        int i = 0;
        for(Shape shape : shapes){
            System.out.println("Shape " +shape.getName()+ " : " + shape.getArea());
        }
        
        
        
    }
}