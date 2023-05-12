import java.lang.reflect.Array;
import java.util.*;

public class T6_Y1_Homework_1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            number.add(new Random().nextInt(100));
            System.out.println(number.get(x));
        }
        number.sort(new NumberComparator());
        System.out.println(number);

    }
}
    class NumberComparator implements Comparator <Integer> {


        @Override
        public int compare(Integer o1, Integer o2) {
            boolean o1IsEven = o1%2 ==0;
            boolean o2IsEven = o2%2 ==0;
            if (o1IsEven && o2IsEven ){
                return o1 -o2;
            }else if (o1IsEven && !o2IsEven ) {
                return 1;
            }else if (!o1IsEven && o2IsEven ) {
                return -1;
            }else if (!o1IsEven && !o2IsEven ){
                return o2 - o1;
            }

            return 0;
        }
    }


