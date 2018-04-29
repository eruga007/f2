public class Rec extends Shape{
    private double width;
    private double hight;
    public Rec(String name,int width,int hight){
        super(name);
        this.hight = hight;
        this.width = width;
    }
    public double getArea(){
        return width * hight;
    }
    public double getWidth(){
        return width;
    }
    public double gethight(){
        return hight;
    }
    public static void main(String[] args){
        Rec r = new Rec("gg",2,3);
        System.out.print("name : " + r.getName() + "Area : " + r.getArea());
    }
}
