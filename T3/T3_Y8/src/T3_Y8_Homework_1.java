//1.  Реализуйте методы, max(x,y) - для целых, вещественных чисел, и для строк (вслучае строк - возвращает самую длинную).



public class T3_Y8_Homework_1 {
    public static void main(String[] args) {
        getMax(10,9);
        getMax(10.2,20.23);
        getMax("Первая строка", "Вторая строка ");



    }
    static  int getMax (int x, int y){
        if (x > y) return x;
        else return y;
    }
    static  double getMax (double x, double y){
        if (x > y) return x;
        else return y;
    }
    static  String getMax (String x, String y){
        if (x.length() > y.length()) return x;
        else return y;
    }
}
