public class TicketMain {
    public static void main(String[] args) {
        TicketDemo ticket = new TicketDemo(5);
        Thread window01 = new Thread(ticket, "窗口01");
        Thread window02 = new Thread(ticket, "窗口02");
        Thread window03 = new Thread(ticket, "窗口03");
        window01.start();
        window02.start();
        window03.start();
    }
}
