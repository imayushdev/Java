package MultiThreading.LockDemo;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketBooking {
    int availableSeats = 1;
    Lock lock = new ReentrantLock();


    void bookTicket(String Username) {
        boolean locked=lock.tryLock();
         if(locked)
         {
             try
             {
                 if(availableSeats>0)
                 {
                     System.out.println(Username+" is Booking Ticket");
                     availableSeats--;
                     System.out.println("Booking Successful");
                 }
                 else
                 {
                     System.out.println(Username +"No Seats Available");
                 }

             }finally
             {
                 lock.unlock();
             }
         }
         else
         {
             System.out.println(Username+" Could Not Get lock");
             System.out.println("Try Again !! ");
         }
         }

}
    class TicketThread extends Thread
    {
        TicketBooking ticketBooking;
        String username;

        public TicketThread(TicketBooking ticketBooking,String username)
        {
                 this.ticketBooking=ticketBooking;
                 this.username=username;
        }

        @Override
        public void run() {
            ticketBooking.bookTicket(username);
        }
    }

public class TicketBookingTest {
    public static void main(String[] args) {
        TicketBooking ticketBooking= new TicketBooking();
        TicketThread   t1 = new TicketThread(ticketBooking,"Ayush");
        TicketThread t2 = new TicketThread(ticketBooking,"Aryan");
        t1.start();
        t2.start();
    }
}
