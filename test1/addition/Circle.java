public class Circle extends Shape{
    private double radius;
    public Circle(String name,double radius){
        super(name);
        this.radius = radius;  
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getRadius(){
        return radius;
    }
    public static void main(String[] args){
        Circle a = new Circle("G",2);
        System.out.print("Name : " + a.getName() + "  Area : " + a.getArea() );
    }
}