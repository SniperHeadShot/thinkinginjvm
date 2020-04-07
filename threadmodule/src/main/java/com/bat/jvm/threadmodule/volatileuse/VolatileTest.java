package com.bat.jvm.threadmodule.volatileuse;

/**
 * Volatile
 *
 * @author ZhengYu
 * @version 1.0 2020/4/7 11:54
 **/
public class VolatileTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        while (true) {
            boolean alive = thread.isAlive();
            System.out.println(alive);
            if (!alive) {
                break;
            }
        }
    }
}
