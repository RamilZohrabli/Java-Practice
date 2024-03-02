package week05;
class Rectangle implements Cloneable {
    private int width, height;
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
    @Override
    protected Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
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
        // The task 4 for week06
        Rectangle rect1 = r1.clone();
        Rectangle rect2 = r2.clone();
        Rectangle rect3 = r3.clone();
        System.out.println(rect1.equals(r1));//true
        System.out.println(rect2.equals(r2));//true
        System.out.println(rect3.equals(r3));//true
        System.out.println(rect1.equals(r3));//true 
        System.out.println(rect2.equals(r1));//false
    }
}
