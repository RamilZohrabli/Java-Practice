package week03.geometry;

public class Point{
    private float x;
    private float y;
    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void translate(float dX, float dY){
        this.x = this.x + dX;
        this.y = this.y + dY;
    }
    public float distance(Point p){
        float distanceInX = this.x - p.x;
        float distanceInY = this.y - p.y;
        double distance = Math.sqrt(Math.pow(distanceInX, 2) + Math.pow(distanceInY, 2));
        return (float)distance;
    }
    public boolean equals(Point p){
        return this.x == p.getX() && this.y == p.getY();
    }
}
