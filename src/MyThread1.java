public class MyThread1 extends Thread{
    @Override
    public void run() {
        // in ra 100 số lẻ từ 1000
        for (int i = 1001; i < 1201; i=i+2) {
            System.out.println(i);
        }
    }
}
