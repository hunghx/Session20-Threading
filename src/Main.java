public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Thread - đơn vị cơ bản của 1 luồng trong java
//        có 2 cách tạo ra 1 luồng
//        cách 1:
//        Thread th1 = new MyThread2();
//        th1.start();
//        Thread th2 = new MyThread1();
//        th2.start();
        // cách 2
//        MyThread th2 = new MyThread();
//        th2.run();
//            Runnable r1 = new MyRunable1();
//            Runnable r2 = new MyRunable2();
//           Thread th1 = new Thread(r1);
//           Thread th2 = new Thread(r2);
//           th1.start();
//           th2.start();
        Runnable rA = new PrintCharacter(100,'A');
        Runnable rB = new PrintCharacter(100,'B');
        Runnable rC = new PrintCharacter(100,'C');
        Runnable r100 = new PrintNumber(100);
       Thread t1 =new Thread(rA);
       Thread t2 =new Thread(rB);
       Thread t3 =new Thread(rC);
       Thread t4 =new Thread(r100);

        t4.start();
        try {
            Thread.sleep(2000);
            t4.stop();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
       t3.start();
        t1.start();
//       Thread anonymous1 = new Thread(){  // lớp nặc danh
//           @Override
//           public void run() {
//               for (int i = 0; i < 10; i++) {
//                   if (i==3) {
//                       try {
//                           Thread.sleep(3000);
//                       } catch (InterruptedException e) {
//                           throw new RuntimeException(e);
//                       }
//                   }
//                   System.out.println(i);
//               }
//           }
//       } ;
//       anonymous1.start();
//       Thread anonymous2 = new Thread(()->{
//           // code ghi đè phương thức run
//       });

    }
    public static void thread1(){

    }

}