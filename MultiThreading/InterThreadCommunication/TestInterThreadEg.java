package MultiThreading.InterThreadCommunication;

public class TestInterThreadEg {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Main Thread Calling wait()");
        synchronized (t1) {
            t1.wait();   //if not in synchronized block exception thread not owner
        }
        System.out.println("Main thread got notified");

    }
}
class MyThread extends Thread{
    int total =0;

    @Override
    public void run(){
        synchronized (this){
            System.out.println("Child Thread Start Calculating>>");
            for(int i =0;i<100;i++){
                total+=1;
            }
            System.out.println("Child Thread Giving Notification");

            this.notify();  //if this commented then java automatically calls notifyAll()
        }

    }
}

//join() me thread kaa wait
//wait() me lock kaa wait
