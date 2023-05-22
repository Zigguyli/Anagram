package collection.thread_safe;

import java.util.ArrayList;

public class SynchronizedCollectionEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> sourse = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sourse.add(i);
        }
        ArrayList<Integer> target = new ArrayList<>();
        Runnable runnable = () ->{target.addAll(sourse);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
//        thread1.join();
//        thread2.join();
    }
}
