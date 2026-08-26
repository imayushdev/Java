package MultiThreading.ThreadCreation;

public class ThreadCreationWayTwo implements Runnable{     //implemented runnable i/f
    public void run(){       // told what is  the task

        for(int i =0;i<6;i++){
            System.out.println(Thread.currentThread().getName()+ " Prints "+i);
        }
        System.out.println("Executing the created thread");

    }
}

class ThreadTest {
    public static void main(String[] args) {
        ThreadCreationWayTwo test =new  ThreadCreationWayTwo();  //obj of class who knows task that we want to execute by thread
        Thread thread = new Thread(test);  //actual task told to Thread class because runnable only declares task
        thread.setName("Custom Thread ");
        thread.start();             //that task executed after creation of new thread

        for (int i=6;i<11;i++){
            System.out.println(Thread.currentThread().getName()+ " prints "+i);
        }

     //same implementation of sleep (),join() etc.
    }
}
//It is very imp dY TO DECIDE WHt to do
//Lets make some try to understand what to do
