import java.lang.reflect.Array;
import java.util.LinkedList;

public class Linkedlistsprac {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(0,5);
        list.addFirst(2);;
        list.addLast(6);

//        2516
        System.out.println(list.contains(6));

        Object[] var= list.toArray();
    }
}
