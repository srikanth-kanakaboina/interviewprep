package com.basic.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("Begin");
            service.execute(() -> System.out.println("Printing Service"));
            service.execute(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Printing Record	:	" + i);
                }
            });

            service.execute(() -> System.out.println("Printing Service"));

        } finally {
            if (service != null) service.shutdown();
        }

    }

}
