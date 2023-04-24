//2.  Реализуйте методы and(boolean x, boolean y), and(boolean x, int y), and(int x, boolean y), который будет возвращать логическое И.
//    Целые числа равные 0 трактовать как false, остальные true.
public class T3_Y8_Homework_2 {
    public static void main(String[] args) {
        getAnd(false, true);
        getAnd(true, 10);
        getAnd(0,true);


    }
    static boolean getAnd (boolean x, boolean y){
        boolean z = x && y;
        return z;
    }

    static boolean getAnd (boolean x, int y){
        boolean z = false;
        if ((y>0) && (x)) z=true;
        return z;
    }

    static boolean getAnd (int y, boolean x){
        boolean z = false;
        if ((y>0) && (x)) z=true;
        return z;
    }
}
