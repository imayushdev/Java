package MultiThreading.InterThreadCommunication;

 class Classroom{
     boolean classStarted = false;
     public synchronized void waitForTeacher ()throws  InterruptedException{

         while(!classStarted){
             System.out.println("Students waiting for teacher");
             wait();
         }
         System.out.println("Student Started joining"); //3 student can join
     }
     public synchronized void startClass(){          //1 class Started
         System.out.println("Teacher Starting Class");
         classStarted=true;
         notify();                // 2 notifies to student

     }


 }
 class StudentThread extends Thread{
     private Classroom classroom;
     public StudentThread(Classroom classroom){
         this.classroom=classroom;
     }
     public void run(){
         try {
             classroom.waitForTeacher();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }


 }
class TeacherThread extends Thread{
     private Classroom classroom;
     public TeacherThread(Classroom classroom){
         this.classroom = classroom;
     }

     public void run(){

         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         classroom.startClass();
     }
}



public class ClassTest {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        StudentThread student = new StudentThread(  classroom);
        TeacherThread teacher = new TeacherThread(classroom);
        student.start();
        teacher.start();


    }

}

//after synchronization java also give more flexible APIs
