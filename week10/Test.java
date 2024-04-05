package week10;
class GeneralClass <T>{
    private T someObj;
    public void setObject(T obj){
        someObj = obj;
    }

    public T getObject(){
        return someObj;
    }
}
public class Test{
    public static void main(String[] args) {
        GeneralClass<Integer> gc = new GeneralClass<>();
        Integer i = 15;
        gc.setObject(i);
        System.out.println(gc.getObject());
        Integer j = 30;
        gc.setObject(j);
        System.out.println(gc.getObject());
    }
}