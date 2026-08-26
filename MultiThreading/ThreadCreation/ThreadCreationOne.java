package MultiThreading.ThreadCreation;
//creation of thread way 1
//extend thread
//override run method to tell work
public class ThreadCreationOne extends Thread {  //my class behave as thread class
    public void run() {                       // told what to do
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " prints "+i);
        }
        System.out.println("Thread running"); //execution by thread of this class

    }
}
class test{
    public static void main(String[] args) throws InterruptedException {
        ThreadCreationOne test = new ThreadCreationOne();

        test.start(); //execution of thread started
       // test.join();  //ensures before main thread first task of other thread will be complete.
        for (int i = 6;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " prints "+i);      //concurrently execution by main thread
                                           //random access by thread scheduler so mixed o/p
        }
        Thread.sleep(2,5); //sleeps thread in which class or method invoked as in main then it will sleep
        Thread.yield();
        System.out.println("Multi Threading Enabled");


    }
}
//key
/*
sleep() method pauses current thread for some time
yield() method gives hint to scheduler and allow other equal priority thread to execute first.
join() method keep main thread in waiting state until the execution of
                  other thread not complete.

 */


