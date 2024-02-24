package week05;
class Rectangle {
    int width, height;
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    @Override
    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        if(rect.width == width && rect.height == height) {       
            return true;
        }
        else{
            return false;
        }
    }
}
public class Task11 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(15,10);
        Rectangle r3 = new Rectangle(5,10);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(r3));
    }
}
