package MagicClass;
import java.util.Random;
public class MagicBox<T> {
    T[] objects;

    public MagicBox(int Length){
        objects = (T[]) new Object[Length];
    }
    public boolean add(T things){
        for (int i = 0; i<objects.length; i++){
            if(objects[i] == null){
                objects[i] = things;
                return true;
            }
        }
        return false;
    }

    public T pick(){
        for (int i = 0; i < objects.length; i++) {
            if (objects[i]==null){
                throw new RuntimeException(String.format("В коробке осталось еще " + (objects.length-i)+ " мест"));
            }

        }
        Random random = new Random();
        int randomInt = random.nextInt(objects.length);
        return objects[randomInt];
    }
}