//1. Создать класс NewThread расширяющий Thread.
//2. Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
//3. Создать экземпляр класса и запустить новый поток.


package Multithreading;

public class MainTread {
    public static void main(String[] args) {
        NewTread MayTread = new NewTread();
        MayTread.run();

        for (int i = 0; i < 3; i++) {
            Thread x = new Thread(new RunTread());
            for (int z = 0; z < 101; z++) {
                if (z % 10 == 0) System.out.println(z);
            }
        }
    }
    static class NewTread extends Thread {

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 100; i++) {
                System.out.println("Число " + i);
            }
        }
    }
}
    class RunTread implements Runnable {

        @Override
        public void run() {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
