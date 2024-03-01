package week06;
import week03.geometry.Point;
import week03.geometry.Segment;
import java.util.Scanner;
interface Movable{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovePoint implements Movable{
    private Point point;
    public MovePoint(Point point){
        this.point = point;
    }
    public Point getPoint() {
        return point;
    }
    @Override
    public void moveUp(){
        point.translate(0, 1);
    }
    @Override
    public void moveDown(){
        point.translate(0,-1);
    }
    @Override
    public void moveLeft(){
        point.translate(-1,0);
    }
    @Override 
    public void moveRight(){
        point.translate(1,0);
    }
}

class MoveSegment implements Movable{
    private Segment segment;
    public MoveSegment(Segment segment){
        this.segment = segment;
    }
    @Override 
    public void moveUp(){
        segment.translate(0,1.0f);
    }
    @Override 
    public void moveDown(){
        segment.translate(0,-1.0f);
    }
    @Override
    public void moveLeft(){
        segment.translate(-1.0f, 0);
    }
    @Override
    public void moveRight(){
        segment.translate(1, 0.0f);
    }
}

class Circle implements Movable{
    private int x;
    private int y;
    private int radius;
   
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y; 
        this.radius = radius;
    } 
    public int getX(){
        return x;
    }
    public void setX(int x){
         this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public void moveUp(){
        y++;
    }
    @Override
    public void moveDown(){
        y--;
    }
    @Override
    public void moveLeft(){
        x--;
    }
    @Override
    public void moveRight(){
        x++;
    }
}
public class Task6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int radius = scan.nextInt();
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        String direction = scan.next();
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        Circle circle = new Circle(x, y, radius);
        circle.moveUp();
        System.out.println("(" + circle.getX() + ";" + circle.getY() + ")");
        circle.moveDown();
        System.out.println("(" + circle.getX() + ";" + circle.getY() + ")");
        circle.moveLeft();
        System.out.println("(" + circle.getX() + ";" + circle.getY() + ")");
        circle.moveRight();
        System.out.println("(" + circle.getX() + ";" + circle.getY() + ")");
        System.out.println("The radius of circle is " + circle.getRadius());
        Movable[] movableObjects = new Movable[3];
        movableObjects[0] = new MovePoint(new Point(x1, y1));
        movableObjects[1] = new MoveSegment(new Segment(point1, point2));
        movableObjects[2] = circle;
        scan.close();
        moveAllOfThem(movableObjects, direction);
    }
    // The method for moving all of them
    public static void moveAllOfThem(Movable[] movableObjects, String direction) {
        for (Movable obj : movableObjects) {
            switch (direction.toLowerCase()) {
                case "up":
                    obj.moveUp();
                    break;
                case "down":
                    obj.moveDown();
                    break;
                case "left":
                    obj.moveLeft();
                    break;
                case "right":
                    obj.moveRight();
                    break;
            }
        }
        for (Movable obj : movableObjects) {
            if (obj instanceof Circle) {
                Circle circle = (Circle) obj;
                System.out.println("Circle: (" + circle.getX() + ", " + circle.getY() + ")");
            } else if (obj instanceof MovePoint) {
                MovePoint movePoint = (MovePoint) obj;
                System.out.println("MovePoint: (" + movePoint.getPoint().getX() + ", " + movePoint.getPoint().getY() + ")");
            } else if (obj instanceof MoveSegment) {
                MoveSegment moveSegment = (MoveSegment) obj;
            }
        }
    }

}

