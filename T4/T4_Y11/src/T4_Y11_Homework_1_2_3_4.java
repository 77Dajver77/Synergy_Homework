//1.  Что такое stacktrace? - Цепочка вызовов метода.
//2.  Выведите stacktrace.
//3.  Какой самый простой способ проследить цепочку вызовов конкретного метода? - В дебагире.
//4.  А второй способ? Воспользоваться StackTraceElement[].
public class T4_Y11_Homework_1_2_3_4 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        System.out.println("method1");
        method2();
    }

    static void method2() {
        System.out.println("method2");
        method3();
    }

    static void method3() {
        System.out.println("method3");
        method4();
    }

    static void method4() {
        System.out.println("method4");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println(stackTrace[i]);
        }
    }
}