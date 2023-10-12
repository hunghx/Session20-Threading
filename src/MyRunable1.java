public class MyRunable1 implements Runnable{
    @Override
    public synchronized void run() {
        for (int i = 1; i <=100 ; i++) {
            System.out.printf("số thứ tự nhiên thứ %d là %d\n",i,i);
        }
    }
}
