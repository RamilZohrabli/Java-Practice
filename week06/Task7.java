package week06;
interface Resizable{
    public void resize(double number);
   }
abstract class Shape{
    protected String color = "red";
    protected boolean filled = true;
    //Default constructor
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "[color = " + color + ", filled= " + filled + "]";
    }
}

class Circle extends Shape implements Resizable{
    protected double radius = 1.0;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
    }
    @Override 
    public void resize(double number){
        radius = radius * number;
    }
}
class Rectangle extends Shape implements Resizable{
    protected double width = 1.0;
    protected double length = 1.0;
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*(length + width);
    }
    @Override
    public String toString(){
        return "Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]";
    }
    @Override
    public void resize(double number){
        width = width + number;
        length = length - number;
    }
}
class Square extends Rectangle{
    public Square(){
        super(1.0,1.0);
    }
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public String toString(){
        return "Square [Rectangle " + super.toString() + "]";
    }
    @Override 
    public void resize(double number){
        super.resize(number);
    }
}
