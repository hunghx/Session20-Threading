package synchronize;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;


public class AccountWithoutSync{

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(20);  // khơi tạo tài khoản 0 đồng
        // tạo 100 luồng
        OperatingSystemMXBean operatingSystemMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        System.out.println("CPU = "+ operatingSystemMXBean.getProcessCpuLoad() );

        // Hiển thị thông tin CPU
//        System.out.println("CPU Usage: " + cpuUsage + "%");
//
//        for (int i = 0; i < 100; i++) {
//            Thread t = new Thread(new AddTask(account));
//            t.start();
////            Runnable r =new AddTask(account);
////            r.run();
//        }

//        System.out.println("In ra số dư hiện tại :"+ account.getBalance());
    }
    private static class AddTask implements Runnable{
        private Account account1;

        public AddTask(Account account) {
            this.account1 = account;
        }

        @Override
        public void run() {
            // nạp tiền đồng bộ
                account1.deposit(10);
        }
    }
}
