public class TicketDemo implements Runnable {
    private int num;

    public TicketDemo(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num > 0) {
            ticket();
        }
    }

    private void ticket() {
        synchronized (this) {
            if (num <= 0) {
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "出售" + num--);
        }
    }

}
