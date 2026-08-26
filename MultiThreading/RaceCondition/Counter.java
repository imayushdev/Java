package MultiThreading.RaceCondition;

public class Counter{
    int count =0;
    synchronized void increment()  {    //critical section
                                      //made system synchronized
        count++;
    }
}

class CounterTest extends Thread{
    Counter counter;
    CounterTest(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i =0;i<=1000;i++){
            counter.increment();
        }
    }
}
class test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterTest t1 = new CounterTest(counter);
        CounterTest t2 = new CounterTest(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.count);

    }
}

//increment is critical section as it is shared resource fpr t1 , t2
//both t1 , t2 sharing increment() and so leads inconsistent results
//which is race condition that diff threads performing operation on shared resource
//solution
//use synchronized keyword that ensures lock for method and only one
//thread can go inside critical section

