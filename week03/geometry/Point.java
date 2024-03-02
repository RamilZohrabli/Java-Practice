package week03.geometry;

public class Point implements Cloneable{
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
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        return Float.compare(other.x, x) == 0 && Float.compare(other.y, y) == 0;
    }

    //The task 5 for week06 
    // Shallow cloning
    @Override
    protected Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("This can't happen!");
        }
    }
    
    
    
}
