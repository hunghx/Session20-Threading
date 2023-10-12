public class MyThread2 extends Thread{
    @Override
    public void run() {
        // in ra 100 số chẵn từ 1000
        for (int i = 1000; i < 1200; i=i+2) {
            System.out.println(i);
        }
    }
}
