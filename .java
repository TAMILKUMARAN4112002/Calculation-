import java.util.Scanner;

abstract class Shape{
    float area;
    abstract void acceptInput();
    abstract void calcArea();
    void dispArea(){
        System.out.println("The Area is " +  area);
        System.out.println("----------------------------------");
    }
}
class Square extends Shape{
    private float side;

    @Override
    void acceptInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a side : ");
        side = sc.nextFloat();
    }
    @Override
    void calcArea(){
        area = side*side;
    }
}
class Rectangle extends Shape{
    private float length;
    private float breath;
    @Override
    void acceptInput(){
         Scanner sc =new Scanner(System.in);
         System.out.print("Enter a Length : ");
         length = sc.nextFloat();
        System.out.print("Enter a breath : ");
        breath = sc.nextFloat();
    }
    @Override
    void calcArea(){
        area = length * breath;
    }
}
class Circle extends Shape{

    private final float pi = 3.14f;
    private float radius;

    @Override
    void acceptInput(){
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter a radius : ");
         radius = sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = pi*(radius*radius);
    }
}
class Geometry {
    void permit(Shape ref){
        ref.acceptInput();
        ref.calcArea();
        ref.dispArea();
    }
}
class Main{
    public static void main(String [] args){
        Square s= new Square();
        Rectangle r = new Rectangle();
        Circle c= new Circle();
         Geometry g= new Geometry();
         g.permit(s);
         g.permit(r);
         g.permit(c);
    }
}
