package day06;

//compile
//javac

//run

//package to jar

//run the jar

public class App {

    public static void main(String[] args) {

        // create a thread
        // define new Runnable() inside Thread
        Thread th = new Thread(new Runnable() {

            // implement run interface
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                }
            }

        });
        th.start();
    }

}
