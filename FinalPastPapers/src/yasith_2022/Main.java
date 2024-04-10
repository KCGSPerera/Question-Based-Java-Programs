package yasith_2022;

//Yasith answer for 2022 november paper

import java.util.Scanner;

class Pattern01 extends Thread {
 private final Object lock;
 private final String pattern;
 private final int count;

 public Pattern01(Object lock, String pattern, int count) {
     this.lock = lock;
     this.pattern = pattern;
     this.count = count;
 }

 @Override
 public void run() {
     synchronized (lock) {
         for (int i = 1; i <= count; i++) {
             try {
                 lock.wait();
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("Pattern01 Thread = " + pattern.repeat(i));
             lock.notify();
         }
     }
 }
}

class Pattern02 extends Thread {
 private final Object lock;
 private final String pattern;
 private final int count;

 public Pattern02(Object lock, String pattern, int count) {
     this.lock = lock;
     this.pattern = pattern;
     this.count = count;
 }

 @Override
 public void run() {
     synchronized (lock) {
         for (int i = 1; i <= count; i++) {
             try {
                 lock.notify();
                 lock.wait();
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("Pattern02 Thread = " + pattern.repeat(i));
         }
     }
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the pattern style for Pattern01: ");
     String pattern01Style = scanner.nextLine();

     System.out.print("Enter the pattern style for Pattern02: ");
     String pattern02Style = scanner.nextLine();

     System.out.print("Enter the count: ");
     int count = scanner.nextInt();

     Object lock = new Object();
     Pattern01 pattern01 = new Pattern01(lock, pattern01Style, count);
     Pattern02 pattern02 = new Pattern02(lock, pattern02Style, count);

     pattern01.setName("Pattern01");
     pattern02.setName("Pattern02");

     System.out.println("=======Threads start printing pattern.");

     pattern01.start();
     pattern02.start();
 }
}
